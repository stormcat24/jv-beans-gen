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
public class Code2101 extends BaseCode {

    private Integer byteLength;
    
    private Integer value;
    
    private String name;
    
    private String nameChar2;
    
    private String nameEng;
    
    private String nameEngShort;

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
    public Integer getValue() {
        return value;
    }

    /**
     * @param value セットする value
     */
    @Column(columnName = "値")
    public void setValue(Integer value) {
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
    @Column(columnName = "内容", headerMerged = 0)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return nameChar2
     */
    public String getNameChar2() {
        return nameChar2;
    }

    /**
     * @param nameChar2 セットする nameChar2
     */
    @Column(columnName = "内容", headerMerged = 2)
    public void setNameChar2(String nameChar2) {
        this.nameChar2 = nameChar2;
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
    @Column(columnName = "内容", headerMerged = 4)
    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    /**
     * @return nameEngShort
     */
    public String getNameEngShort() {
        return nameEngShort;
    }

    /**
     * @param nameEngShort セットする nameEngShort
     */
    @Column(columnName = "内容", headerMerged = 5)
    public void setNameEngShort(String nameEngShort) {
        this.nameEngShort = nameEngShort;
    }
    
}
