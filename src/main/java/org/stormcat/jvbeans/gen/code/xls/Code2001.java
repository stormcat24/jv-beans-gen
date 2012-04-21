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
public class Code2001 extends BaseCode {

    private Integer byteLength;
    
    private String value;
    
    private String name;
    
    private String nameChar1;
    
    private String nameChar2;
    
    private String nameChar3;
    
    private String nameEng;
    
    private String nameEngChar3;

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
     * @return courseName
     */
    public String getName() {
        return name;
    }

    /**
     * @param courseName セットする courseName
     */
    @Column(columnName = "内容", headerMerged = 0)
    public void setCourseName(String name) {
        this.name = name;
    }

    /**
     * @return courseNameChar1
     */
    public String getNameChar1() {
        return nameChar1;
    }

    /**
     * @param courseNameChar1 セットする courseNameChar1
     */
    @Column(columnName = "内容", headerMerged = 1)
    public void setNameChar1(String nameChar1) {
        this.nameChar1 = nameChar1;
    }

    /**
     * @return courseNameChar2
     */
    public String getNameChar2() {
        return nameChar2;
    }

    /**
     * @param courseNameChar2 セットする courseNameChar2
     */
    @Column(columnName = "内容", headerMerged = 2)
    public void setNameChar2(String nameChar2) {
        this.nameChar2 = nameChar2;
    }

    /**
     * @return courseNameChar3
     */
    public String getNameChar3() {
        return nameChar3;
    }

    /**
     * @param courseNameChar3 セットする courseNameChar3
     */
    @Column(columnName = "内容", headerMerged = 3)
    public void setNameChar3(String nameChar3) {
        this.nameChar3 = nameChar3;
    }

    /**
     * @return courseNameEng
     */
    public String getNameEng() {
        return nameEng;
    }

    /**
     * @param courseNameEng セットする courseNameEng
     */
    @Column(columnName = "内容", headerMerged = 4)
    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    /**
     * @return courseNameEng3
     */
    public String getNameEngChar3() {
        return nameEngChar3;
    }

    /**
     * @param courseNameEng3 セットする courseNameEng3
     */
    @Column(columnName = "内容", headerMerged = 5)
    public void setNameEngChar3(String nameEngChar3) {
        this.nameEngChar3 = nameEngChar3;
    }

}
