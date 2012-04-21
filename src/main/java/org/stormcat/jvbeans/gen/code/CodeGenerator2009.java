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

import org.stormcat.jvbeans.gen.code.xls.Code2009;
import org.stormcat.jvbeans.gen.code.xls.CodeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class CodeGenerator2009 extends CodeGenerator<Code2009> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return "TrackCd";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<Code2009> getCodeList() {
        CodeSheet sheet = JvBeansGenUtil.getSheet(CodeSheet.class);
        List<Code2009> codeList = new ArrayList<Code2009>();
        for (Code2009 code : sheet.getRow2009Items()) {
            if (StringUtil.isNotBlank(code.getName()) && !"名称".equals(code.getName())) {
                if ("00".equals(code.getValue())) {
                    code.setKey("UNKNOWN");
                } else {
                    code.setNameEng(code.getNameEng().replace("Turf→Dirt", "Turf_Dirt"));
                    if (code.getName().startsWith("平地")) {
                        code.setKey(String.format("FLAT_%s", maskKey(code.getNameChar6())));
                    } else if (code.getName().startsWith("障害")) {
                        code.setKey(String.format("OBSTACLE_%s", maskKey(code.getNameChar6())));
                    }    
                }
                codeList.add(code);
            }
        }
        return codeList;
    }
    
    private String maskKey(String key) {
        return key.replace("芝", "TURF").replace("・", "_").replace("ダート", "DIRT").replace("サンド", "SAND")
            .replace("直", "STRAIGHT").replace("左", "LEFT").replace("右", "RIGHT")
            .replace("内→外", "_IN_TO_OUT").replace("外→内", "_OUT_TO_IN").replace("内", "_IN").replace("外", "_OUT")
            .replace("２周", "_AROUND2").replace("→", "_TO_");
    }
    

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "<b>2009.トラックコード</b> のEnumによる表現です。";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/code/2009.vm";
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getType() {
        return "String";
    }

}
