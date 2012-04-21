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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.stormcat.commons.lang.StringUtil;

import org.stormcat.jvbeans.gen.code.xls.Code2007;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2007 extends CodeGenerator<Code2007> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "RaceConditionCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2007> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2007> codeList = new ArrayList<Code2007>();
        DecimalFormat df = new DecimalFormat("000");
        
        boolean flg = false;
        for (Code2007 code : sheet.getRow2007Items()) {
            if (!"名称".equals(code.getName())) {
                String value = code.getValue();
                if ("000".equals(value)) {
                    code.setKey("UNKNOWN");
                    codeList.add(code);
                } else if (code.getName().contains("円以下")) {
                    code.setKey(String.format("_%s00_LESS", value));
                    codeList.add(code);
                } else if (".".equals(value)) {
                    if (!flg) {
                        for (int count = 4; count < 99; count++) {
                            value = df.format(count);
                            Code2007 c = new Code2007();
                            c.setValue(value);
                            c.setName(String.format("%s００万円以下", StringUtil.toZenkuakuNum(count)));
                            c.setNameEng(String.format("%d,000,000 & LESS", count));
                            if (count < 10) {
                                c.setKey(String.format("_00%d00_LESS", count));    
                            } else {
                                c.setKey(String.format("_0%d00_LESS", count));
                            }
                            codeList.add(c);
                        }
                        flg = true;
                    }
                } else {
                    code.setName(code.getName().replace(" ", ""));
                    code.setKey(code.getNameEng());
                    codeList.add(code);
                }
            }
        }
        
        return codeList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "<b>2007.競走条件コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2007.vm";
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }
    
    
}
