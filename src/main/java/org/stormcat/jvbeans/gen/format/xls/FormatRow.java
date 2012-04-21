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
package org.stormcat.jvbeans.gen.format.xls;

import net.java.amateras.xlsbeans.annotation.Column;

/**
 * @author a.yamada
 *
 */
public class FormatRow {
    
    private Integer no;
    
    private String childNo;
    
    private String key;
    
    private String itemName;
    
    private String offset;
    
    private String repeat;
    
    private Integer byteLength;
    
    private Integer totalByteLength;
    
    private String initValue;
    
    private String description;

    /**
     * @return no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * @param no セットする no
     */
    @Column(columnName = "項番")
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * @return childNo
     */
    public String getChildNo() {
        return childNo;
    }

    /**
     * @param childNo セットする childNo
     */
    @Column(columnName = "項番", headerMerged = 1)
    public void setChildNo(String childNo) {
        this.childNo = childNo;
    }

    /**
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key セットする key
     */
    @Column(columnName = "項番", headerMerged = 2)
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName セットする itemName
     */
    @Column(columnName = "項番", headerMerged = 3)
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * @param offset セットする offset
     */
    @Column(columnName = "項番", headerMerged = 4)
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * @return repeat
     */
    public String getRepeat() {
        return repeat;
    }

    /**
     * @param repeat セットする repeat
     */
    @Column(columnName = "項番", headerMerged = 5)
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    /**
     * @return byteLength
     */
    public Integer getByteLength() {
        return byteLength;
    }

    /**
     * @param byteLength セットする byteLength
     */
    @Column(columnName = "項番", headerMerged = 6)
    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }


    /**
     * @return totalByteLength
     */
    public Integer getTotalByteLength() {
        return totalByteLength;
    }

    /**
     * @param totalByteLength セットする totalByteLength
     */
    @Column(columnName = "項番", headerMerged = 7)
    public void setTotalByteLength(Integer totalByteLength) {
        this.totalByteLength = totalByteLength;
    }

    /**
     * @return initValue
     */
    public String getInitValue() {
        return initValue;
    }

    /**
     * @param initValue セットする initValue
     */
    @Column(columnName = "項番", headerMerged = 8)
    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description セットする description
     */
    @Column(columnName = "項番", headerMerged = 9)
    public void setDescription(String description) {
        this.description = description;
    }
}
