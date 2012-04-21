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
public class Code2102 extends BaseCode {

    private Integer byteLength;
    
    private String value;
    
    private String name;
    
    private String nameChar3;
    
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
     * @return nameChar3
     */
    public String getNameChar3() {
        return nameChar3;
    }

    /**
     * @param nameChar3 セットする nameChar3
     */
    @Column(columnName = "内容", headerMerged = 2)
    public void setNameChar3(String nameChar3) {
        this.nameChar3 = nameChar3;
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
