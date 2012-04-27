/*
 * Copyright 2009-2010 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.gen.format;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.stormcat.jvbeans.common.constants.Charset;
import org.stormcat.jvbeans.common.io.FileUtil;
import org.stormcat.jvbeans.common.io.PropertyUtil;
import org.stormcat.jvbeans.common.lang.StringUtil;
import org.stormcat.jvbeans.common.reflect.ClassUtil;
import org.stormcat.jvbeans.gen.BaseGenerator;
import org.stormcat.jvbeans.gen.VelocityContainer;
import org.stormcat.jvbeans.gen.format.xls.FormatRow;

/**
 * @author a.yamada
 * 
 */
public class JvDtoGenerator extends BaseGenerator {

	private String className;

	private String recordTypeId;

	private List<FormatRow> list;

	public JvDtoGenerator(String packageName, String recordTypeId,
			List<FormatRow> list) {
		super(packageName);
		this.className = getValue(recordTypeId, "dto.name");
		this.recordTypeId = recordTypeId;
		this.list = list;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getClassName() {
		return className;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getJavadoc() {
		return "";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getTemplate() {
		return "src/main/resources/org/stormcat/jvbeans/gen/format/dto.vm";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void prepare(VelocityContainer container) {
		int byteLength = 0;
		int beforeNo = 0;
		Map<Integer, JvBeansMeta> metaMap = new LinkedHashMap<Integer, JvBeansMeta>();
		List<DataDivEntry> dataDivItems = null;
		for (FormatRow row : list) {
			int no = row.getNo();
			String offset = row.getOffset();
			if (no != 0) {
				beforeNo = no;
				if ("レコード区切".equals(row.getItemName())) {
					byteLength = Integer.parseInt(row.getOffset())
							+ row.getByteLength() - 1;
					continue;
				}
				if ("データ区分".equals(row.getItemName())) {
					dataDivItems = getDataDivMap(row.getDescription());
				}
				JvBeansMeta property = new JvBeansMeta();
				property.setPosition(Integer.parseInt(row.getOffset()));
				property.setByteLength(row.getByteLength());
				property.setItemName(row.getItemName());
				property.setRepeatCount(row.getRepeat());
				property.setTotalByteLength(row.getTotalByteLength());
				property.setName(getValue(recordTypeId,
						String.format("no_%d.name", no)));
				property.setType(getValue(recordTypeId,
						String.format("no_%d.type", no)));
				property.setCorrection(getCorrection(row.getDescription()));
				if (row.getItemName().contains("ハロンタイム")) {
					property.setCorrection(0.1f);
				}
				metaMap.put(no, property);

			} else if (StringUtil.isNotBlank(offset) && offset.charAt(0) == '(') {
				if (metaMap.containsKey(beforeNo)) {
					int position = extractByteLength(offset);
					JvBeansMeta parents = metaMap.get(beforeNo);
					JvBeansMeta child = new JvBeansMeta();
					child.setPosition(position);
					child.setByteLength(row.getByteLength());
					child.setItemName(row.getItemName());
					child.setRepeatCount(row.getRepeat());
					child.setName(getValue(recordTypeId,
							String.format("no_%d_%d.name", beforeNo, position)));
					child.setType(getValue(recordTypeId,
							String.format("no_%d_%d.type", beforeNo, position)));
					child.setCorrection(getCorrection(row.getDescription()));
					parents.addChildMeta(child);
				}
			} else if (StringUtil.isNotBlank(offset)
					&& StringUtil.isNotBlank(row.getChildNo())) {
				if (metaMap.containsKey(beforeNo)) {
					int position = Integer.parseInt(offset);
					JvBeansMeta parents = metaMap.get(beforeNo);
					JvBeansMeta child = new JvBeansMeta();
					child.setPosition(position);
					child.setByteLength(row.getByteLength());
					child.setItemName(row.getItemName());
					child.setRepeatCount(row.getRepeat());
					child.setName(getValue(recordTypeId,
							String.format("no_%d_%d.name", beforeNo, position)));
					child.setType(getValue(recordTypeId,
							String.format("no_%d_%d.type", beforeNo, position)));
					parents.addChildMeta(child);
				}
			}
		}

		container.addParameter("recordTypeId", recordTypeId);
		container.addParameter("byteLength", byteLength);
		container.addParameter("propertyList", metaMap.values());
		container.addParameter("parent", true);
		container.addParameter("dataDivEnumName",
				String.format("%sDataDiv", className.replace("Dto", "")));
		container.addParameter("dataDivItems", dataDivItems);
		File source = new File(String.format("%s/%s.java",
				getSourceDir(packageName), className));
		FileUtil.writeStringToFile(source, container.toString(), Charset.UTF8);
		logger.info(String.format("%s.java を生成しました。", className));

		for (Entry<Integer, JvBeansMeta> entry : metaMap.entrySet()) {
			JvBeansMeta parent = entry.getValue();
			if (parent.isRepeat()) {
				if (!parent.getType().startsWith(packageName)) {
					continue;
				}

				VelocityContainer childCon = new VelocityContainer(getTemplate(), Charset.UTF8);
				String childPackage = ClassUtil
						.getPackageName(parent.getType());
				String childClassName = ClassUtil
						.getClassName(parent.getType());
				childCon.addParameter("packageName", childPackage);
				childCon.addParameter("className", childClassName);
				childCon.addParameter("byteLength", parent.getTotalByteLength());
				childCon.addParameter("propertyList", parent.getChildMetaList());
				childCon.addParameter("parent", false);
				childCon.addParameter("year",
						Calendar.getInstance().get(Calendar.YEAR));
				File childSource = new File(String.format("%s/%s.java",
						getSourceDir(childPackage), childClassName));
				FileUtil.writeStringToFile(childSource, childCon.toString(),
						Charset.UTF8);
				logger.info(String.format("%s.java を生成しました。", childClassName));
			}
		}
	}

	private String getValue(String recordTypeId, String key) {
		return PropertyUtil.getValue(String.format("%s.%s",
				"org.stormcat.jvbeans.gen.format", recordTypeId), key);
	}

	private Float getCorrection(String description) {
		if (StringUtil.isEmpty(description)) {
			return null;
		}
		if (!description.startsWith("単位")) {
			return null;
		}

		Map<String, Float> map = new HashMap<String, Float>();
		map.put("単位：百円", 100f);
		map.put("単位:0.1kg", 0.1f);
		map.put("単位0.1kg", 0.1f);
		map.put("単位:999.9秒", 0.1f);
		map.put("単位:99.9秒", 0.1f);
		for (Entry<String, Float> entry : map.entrySet()) {
			if (description.contains(entry.getKey())) {
				return entry.getValue();
			}
		}
		return null;
	}

	private int extractByteLength(String target) {
		if (StringUtil.isBlank(target)) {
			return 0;
		}
		return Integer
				.parseInt(target.substring(1, target.length() - 1).trim());
	}

	private List<DataDivEntry> getDataDivMap(String discription) {
		List<DataDivEntry> list = new ArrayList<DataDivEntry>();
		for (String tmp : discription.replace("\n", " ").replace("　", " ")
				.replace("\t", " ").replace("：", ":").split(" ")) {
			String[] s = tmp.split(":");
			if (s.length != 2) {
				continue;
			}
			if (StringUtil.isEmpty(s[0])) {
				continue;
			}
			list.add(new DataDivEntry(s[0], s[1]));
		}
		return list;
	}

}
