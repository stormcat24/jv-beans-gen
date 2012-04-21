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
import java.util.List;

import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class AllRecordTypeIdGenerator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("format version not specified.");
        }
        JvBeansGenUtil.setVersion(args[0]);
        new AllRecordTypeIdGenerator().generate();
    }

    public void generate() {
        DataTypeSheet dataTypeSheet = JvBeansGenUtil.getSheet(DataTypeSheet.class);

        List<DataTypeRow> list = new ArrayList<DataTypeRow>();

        list.addAll(dataTypeSheet.getStoredItems());
        list.addAll(dataTypeSheet.getRealTimeItems());
        list.addAll(dataTypeSheet.getSetupItems());

        new RecordTypeIdGenerator("org.stormcat.jvbeans.jvlink.definitions", list).createSourceFile();
    }

}
