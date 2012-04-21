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
package org.stormcat.jvbeans.gen.code;

import java.util.ArrayList;
import java.util.List;

import org.stormcat.jvbeans.gen.code.xls.Code2201;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2201 extends CodeGenerator<Code2201> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "BreedCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2201> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2201> codeList = new ArrayList<Code2201>();
        for (Code2201 code : sheet.getRow2201Items()) {
            if (!"名称".equals(code.getName())) {
                int value = code.getValue();
                if (value == 0) {
                    code.setKey("UNKNOWN");
                } else if (value == 1) {
                    code.setKey("THOROUGHBRED");
                } else if (value == 2) {
                    code.setKey("THOROUGHBRED_LINE");
                } else if (value == 3) {
                    code.setKey("SEMI_THOROUGHBRED");
                } else if (value == 4) {
                    code.setKey("LIGHT_HALF_BLOOD");
                } else if (value == 5) {
                    code.setKey("ANGLO_ARAB");
                } else if (value == 6) {
                    code.setKey("ARAB_LINE");
                } else if (value == 7) {
                    code.setKey("ARAB");
                } else if (value == 8) {
                    code.setKey("MIDDLE_HALF_BLOOD");
                }
                codeList.add(code);
            }
        }
        return codeList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "<b>2201.品種コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2201.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "Integer";
    }

}
