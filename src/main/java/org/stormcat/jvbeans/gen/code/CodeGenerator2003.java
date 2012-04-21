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

import org.stormcat.commons.lang.StringUtil;

import org.stormcat.jvbeans.gen.code.xls.Code2003;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2003 extends CodeGenerator<Code2003> {
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "GradeCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2003> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        
        List<Code2003> codeList = new ArrayList<Code2003>();
        for (Code2003 code : sheet.getRow2003Items()) {
            if (StringUtil.isNotBlank(code.getValue())) {
                String name = code.getName();
                if (name.startsWith("G1")) {
                    code.setKey("G1");
                } else if (name.startsWith("G2")) {
                    code.setKey("G2");
                } else if (name.startsWith("G3")) {
                    code.setKey("G3");
                } else if (name.startsWith("グレードのない")) {
                    code.setKey("NO_GRADE");
                } else if (name.startsWith("重賞以外")) {
                    code.setKey("NO_GRADE_SPECIAL");
                } else if (name.startsWith("J･G")) {
                    code.setKey(name.replace("J･", "JUMP_").replace("（障害競走）", ""));
                } else if (name.startsWith("一般競走")) {
                    code.setKey("STANDARD");
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
        return "<b>2003.グレードコード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2003.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }

}
