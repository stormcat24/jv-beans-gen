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
import org.stormcat.jvbeans.gen.code.xls.Code2001;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2001 extends CodeGenerator<Code2001> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2001> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);

        List<Code2001> codeList = new ArrayList<Code2001>();
        for (Code2001 code : sheet.getRow2001Items()) {
            if (StringUtil.isNotBlank(code.getValue()) && StringUtil.isNotBlank(code.getName()) && !code.getName().contains("未使用")) {
                code.setKey(maskKey(code.getNameEng()));
                code.setNameEngChar3(StringUtil.isNotBlank(code.getNameEngChar3()) ? String.format("\"%s\"", code.getNameEngChar3()) : "null");
                String value = code.getValue();
                if (value.equals("00")) {
                    code.setKey("NONE");
                } else if (value.equals("A0")) {
                    code.setKey("FOREIGN");
                }
                codeList.add(code);
            }
        }

        return codeList;
    }


    private String maskKey(String key) {
        return key.toUpperCase().replace("(", "_").replace(")", "").replace(" ", "_");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "CourseCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "<b>2001.競馬場コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2001.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }

}
