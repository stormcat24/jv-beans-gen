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

import org.stormcat.jvbeans.gen.code.xls.Code2301;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2301 extends CodeGenerator<Code2301> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "EWBelongCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2301> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2301> codeList = new ArrayList<Code2301>();
        for (Code2301 code : sheet.getRow2301Items()) {
            if (!"名称１".equals(code.getName())) {
                int value = code.getValue();
                if (value == 0) {
                    code.setKey("OTHERS");
                } else if (value == 1) {
                    code.setKey("MIHO");
                } else if (value == 2) {
                    code.setKey("RITTOH");
                } else if (value == 3) {
                    code.setKey("LOCAL_INVITATION");
                } else if (value == 4) {
                    code.setKey("FOREIGN_INVITATION");
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
        return "<b>2301.東西所属コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2301.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "Integer";
    }

}
