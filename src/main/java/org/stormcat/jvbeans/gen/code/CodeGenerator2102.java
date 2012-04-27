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

import org.stormcat.jvbeans.common.lang.StringUtil;
import org.stormcat.jvbeans.gen.code.xls.Code2102;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2102 extends CodeGenerator<Code2102> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "MarginCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2102> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2102> codeList = new ArrayList<Code2102>();
        for (Code2102 code : sheet.getRow2102Items()) {
            if (!"名称".equals(code.getName()) && StringUtil.isNotBlank(code.getName())) {
                String value = code.getValue();
                if ("___".equals(value)) {
                    code.setKey("UNKNOWN");
                } else if ("Z__".equals(value)) {
                    code.setKey("_10");
                } else {
                    if (code.getNameEng().length() == 4) {
                        code.setKey("_" + code.getNameEng().replace("/", "_PER_").replace("１", "1_AND_")
                                .replace("２", "2_AND_").replace("３", "3_AND_"));
                    } else if (code.getNameEng().length() == 1) {
                        code.setKey("_" + String.valueOf((char) (code.getNameEng().toCharArray()[0] - '０' + '0')));
                    } else if (code.getNameEng().length() == 3) {
                        code.setKey("_" + code.getNameEng().replace("/", "_PER_"));
                    } else {
                        code.setKey(code.getNameEng());
                    }
                    
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
        return "<b>2102.着差コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2102.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }
    
    
}
