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

import org.stormcat.jvbeans.gen.code.xls.Code2202;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2202 extends CodeGenerator<Code2202> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "SexCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2202> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2202> codeList = new ArrayList<Code2202>();
        for (Code2202 code : sheet.getRow2202Items()) {
            if (!"名称".equals(code.getName())) {
                int value = code.getValue();
                if (value == 0) {
                    code.setKey("UNKNOWN");
                } else if (value == 1) {
                    code.setKey("MALE");
                } else if (value == 2) {
                    code.setKey("FEMALE");
                } else if (value == 3) {
                    code.setKey("GELDINGS");
                }
                code.setNameEng(code.getNameEng().replace("\n", ", "));
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
        return "<b>2202.性別コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2202.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "Integer";
    }

}
