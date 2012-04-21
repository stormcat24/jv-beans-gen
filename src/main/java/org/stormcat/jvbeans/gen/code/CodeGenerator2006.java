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

import org.stormcat.jvbeans.gen.code.xls.Code2006;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2006 extends CodeGenerator<Code2006> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "RaceSignCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2006> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2006> codeList = new ArrayList<Code2006>();
        for (Code2006 code : sheet.getRow2006Items()) {
            if (!"名称".equals(code.getName())) {
                String value = code.getValue();
                if (code.getName().endsWith(" ")) {
                    code.setName(code.getName().substring(0, code.getName().length() - 1));
                }
                
                if ("000".equals(value)) {
                    code.setKey("UNKNOWN");
                } else if ("002".equals(value)) {
                    code.setKey("YOUNG_JOCKEY");
                    code.setName(code.getName().replace("\n", ", "));
                } else if ("A02".equals(value)) {
                    code.setKey("MIX_YOUNG_JOCKEY");
                    code.setName(code.getName().replace("\n", ", "));
                } else {
                    code.setKey(code.getName().replace(")(", ")-(").replace("](", "]-(").replace(")[", ")-[").replace("][", "]-[")
                            .replace(" ", "_").replace("-", "_").replace("・", "_")
                            .replace("(混合)", "MIX")
                            .replace("(指定)", "DSN")
                            .replace("[指定]", "DES")
                            .replace("(父)", "MARU_D")
                            .replace("(市)", "MARU_A")
                            .replace("(抽)", "MARU_S")
                            .replace("[抽]", "KAKU_S")
                            .replace("(国際)", "INT")
                            .replace("(特指)", "SD")
                            .replace("関東配布馬", "KANTO")
                            .replace("関西配布馬", "KANSAI")
                            .replace("九州産馬", "KYUSHU")
                            .replace("牡", "MALE")
                            .replace("牝", "FEMALE")
                            .replace("ｾﾝ", "GELDINGS"));
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
        return "<b>2006.競走記号コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2006.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }

    
}
