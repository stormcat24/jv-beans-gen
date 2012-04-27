package org.stormcat.jvbeans.gen.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.stormcat.jvbeans.common.io.PropertyUtil;
import org.stormcat.jvbeans.common.lang.StringUtil;
import org.stormcat.jvbeans.gen.BaseGenerator;
import org.stormcat.jvbeans.gen.VelocityContainer;
import org.stormcat.jvbeans.gen.datatype.JvDataSpecGenerator.ItemType;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;

/**
 * @author cocofamous
 */
public class JvResolverGenerator extends BaseGenerator {

	private String className;

	private ItemType itemType;

	private List<List<DataTypeRow>> lists;

	public JvResolverGenerator(String packageName, ItemType itemType,
			List<List<DataTypeRow>> lists) {
		super(packageName);
		this.itemType = itemType;
		this.className = getValue("resolver.name");
		this.lists = lists;
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
		return "src/main/resources/org/stormcat/jvbeans/gen/resolver/resolver.vm";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void prepare(VelocityContainer container) {
		List<Map<String, String>> dataTypeList = new ArrayList<Map<String, String>>();
		for (List<DataTypeRow> list : lists) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("dataType", list.get(0).getDataType());
			map.put("dataSpec", createDataSpecName(list.get(0).getDataType()));
			dataTypeList.add(map);
		}

		container.addParameter("dataSpecTypeJp", getValue("dataSpec.type.jp"));
		container.addParameter("dataTypeList", dataTypeList);
	}

	private String getValue(String key) {
		return PropertyUtil.getValue(String.format("%s.%s",
				"org.stormcat.jvbeans.gen.datatype", itemType.name()), key);
	}

	private String createDataSpecName(String dataType) {
		StringBuilder sb = new StringBuilder(
				"org.stormcat.jvbeans.jvlink.definitions.dataspec._");
		if (dataType.equals("DIFF")) {
			if (itemType.equals(ItemType.STORED)) {
				sb.append("Stored");
			} else if (itemType.equals(ItemType.SETUP)) {
				sb.append("Setup");
			}
		}
		sb.append(StringUtil.capitalize(dataType.toLowerCase()));
		return sb.toString();
	}
}
