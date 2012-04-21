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
public class Code2005 extends BaseCode {

    private Integer byteLength;
    
    private String value;
    
    private String name;
    
    private String nameChar4;
    
    private String nameChar6;
    
    private String nameChar8;
    
    private String nameEng;

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
    @Column(columnName = "内容", headerMerged = 0)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return nameChar4
     */
    public String getNameChar4() {
        return nameChar4;
    }

    /**
     * @param nameChar4 セットする nameChar4
     */
    @Column(columnName = "内容", headerMerged = 1)
    public void setNameChar4(String nameChar4) {
        this.nameChar4 = nameChar4;
    }

    /**
     * @return nameChar6
     */
    public String getNameChar6() {
        return nameChar6;
    }

    /**
     * @param nameChar6 セットする nameChar6
     */
    @Column(columnName = "内容", headerMerged = 2)
    public void setNameChar6(String nameChar6) {
        this.nameChar6 = nameChar6;
    }

    /**
     * @return nameChar8
     */
    public String getNameChar8() {
        return nameChar8;
    }

    /**
     * @param nameChar8 セットする nameChar8
     */
    @Column(columnName = "内容", headerMerged = 3)
    public void setNameChar8(String nameChar8) {
        this.nameChar8 = nameChar8;
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
    
    
    
}
