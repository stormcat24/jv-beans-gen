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
package org.stormcat.jvbeans.gen.recordtypeid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.stormcat.commons.lang.StringUtil;
import org.stormcat.jvbeans.gen.BaseGenerator;
import org.stormcat.jvbeans.gen.VelocityContainer;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;

/**
 * @author a.yamada
 *
 */
public class RecordTypeIdGenerator extends BaseGenerator {

    private List<DataTypeRow> list;

    public RecordTypeIdGenerator(String packageName, List<DataTypeRow> list) {
        super(packageName);
        this.list = list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "ConcreteRecordTypeId";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "レコード種別IDのEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/recordtypeid/recordtypeid.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void prepare(VelocityContainer container) {
        Set<String> recordTypeSet = new HashSet<String>();
        List<RecordType> recordTypeList = new ArrayList<RecordType>();
        for (DataTypeRow row : list) {
            String recordTypeId = row.getRecordTypeId();
            if (StringUtil.isNotBlank(recordTypeId) && recordTypeId.length() == 2) {
                if (!recordTypeSet.contains(recordTypeId)) {
                    recordTypeList.add(new RecordType(recordTypeId, row.getDataName()));
                    recordTypeSet.add(recordTypeId);
                }
            }
            System.out.println(row.getRecordTypeId());
        }
        container.addParameter("recordTypeList", recordTypeList);
    }

}
