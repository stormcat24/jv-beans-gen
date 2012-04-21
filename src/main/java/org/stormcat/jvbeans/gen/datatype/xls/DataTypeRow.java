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
package org.stormcat.jvbeans.gen.datatype.xls;

import net.java.amateras.xlsbeans.annotation.Column;

/**
 * @author a.yamada
 *
 */
public class DataTypeRow {

    private String dataName;
    
    private String dataType;
    
    private String formatNo;
    
    private String recordName;
    
    private String recordTypeId;
    
    private String contents;

    /**
     * @return dataName
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * @param dataName セットする dataName
     */
    @Column(columnName = "データ種別", headerMerged = 0, optional = true, merged = true)
//    @Column(columnName = "名称")
    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param dataType セットする dataType
     */
    @Column(columnName = "データ種別", headerMerged = 1, optional = true, merged = true)
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * @return formatNo
     */
    public String getFormatNo() {
        return formatNo;
    }

    /**
     * @param formatNo セットする formatNo
     */
    @Column(columnName = "データ種別", headerMerged = 2, optional = true)
    public void setFormatNo(String formatNo) {
        this.formatNo = formatNo;
    }
    
    /**
     * @return recordName
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * @param recordName セットする recordName
     */
    @Column(columnName = "データ種別", headerMerged = 3, optional = true)
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * @return recordTypeId
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * @param recordTypeId セットする recordTypeId
     */
    @Column(columnName = "データ種別", headerMerged = 4, optional = true)
    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    /**
     * @return contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * @param contents セットする contents
     */
    @Column(columnName = "データ種別", headerMerged = 5, merged = true, optional = true)
    public void setContents(String contents) {
        this.contents = contents;
    }
    
}
