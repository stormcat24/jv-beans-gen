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
package org.stormcat.jvbeans.gen.code.xls;

import net.java.amateras.xlsbeans.annotation.Column;

/**
 * @author a.yamada
 *
 */
public class Code2203 extends BaseCode {

    private Integer byteLength;
    
    private String value;
    
    private String name;
    
    private String nameEng;
    
    private String nameEngChar5;

    /**
     * @return byteLength
     */
    public Integer getByteLength() {
        return byteLength;
    }

    /**
     * @param byteLength セットする byteLength
     */
    @Column(columnName = "バイト数")
    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value セットする value
     */
    @Column(columnName = "値")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    @Column(columnName = "内容", headerMerged = 0, merged = true)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return nameEng
     */
    public String getNameEng() {
        return nameEng;
    }

    /**
     * @param nameEng セットする nameEng
     */
    @Column(columnName = "内容", headerMerged = 2, merged = true)
    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    /**
     * @return nameEngChar5
     */
    public String getNameEngChar5() {
        return nameEngChar5;
    }

    /**
     * @param nameEngChar5 セットする nameEngChar5
     */
    @Column(columnName = "内容", headerMerged = 4, merged = true)
    public void setNameEngChar5(String nameEngChar5) {
        this.nameEngChar5 = nameEngChar5;
    }
    
    
}
