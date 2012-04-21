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

import org.stormcat.jvbeans.gen.code.xls.Code2204;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2204 extends CodeGenerator<Code2204> {
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "HorseSignCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2204> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2204> codeList = new ArrayList<Code2204>();
        for (Code2204 code : sheet.getRow2204Items()) {
            if (!"名称".equals(code.getName())) {
                String value = code.getValue();
                if ("00".equals(value)) {
                    code.setKey("UNKNOWN");
                } else if ("02".equals(value)) {
                    code.setKey("KAKU_S");
                } else if ("20".equals(value)) {
                    code.setKey("MARU_D_MARU_F");
                } else if ("31".equals(value)) {
                    code.setKey("MOCHIKOMI");
                } else {
                    code.setKey(code.getNameEng().replace(")(", ")-(").replace(")[", ")-[")
                            .replace("(S)", "MARU_S")
                            .replace("(D)", "MARU_D")
                            .replace("(A)", "MARU_A")
                            .replace("(R)", "MARU_R")
                            .replace("(F)", "MARU_F")
                            .replace("(I)", "MARU_I")
                            .replace("[R]", "KAKU_R")
                            .replace("[F]", "KAKU_F")
                            .replace("-", "_"));
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
        return "<b>2204.馬記号コード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2204.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }

}
