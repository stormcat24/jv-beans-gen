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

import org.stormcat.jvbeans.gen.code.xls.Code2303;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2303 extends CodeGenerator<Code2303> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "JockeyMateCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2303> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2303> codeList = new ArrayList<Code2303>();
        for (Code2303 code : sheet.getRow2303Items()) {
            if (!"略名".equals(code.getNameSign())) {
                int value = code.getValue();
                if (value == 0) {
                    code.setKey("UNKNOWN");
                    code.setName(code.getNameSign());
                    code.setNameSign("");
                } else {
                    code.setKey(String.format("REDUCING_WEIGHT_%d", value));
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
        return "<b>2303.騎手見習コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2303.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "Integer";
    }



}
