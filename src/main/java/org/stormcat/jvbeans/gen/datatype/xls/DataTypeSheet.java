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

import java.util.List;

import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.RecordTerminal;
import net.java.amateras.xlsbeans.annotation.Sheet;

/**
 * @author a.yamada
 *
 */
@Sheet(name = "データ種別一覧")
public class DataTypeSheet {

    private List<DataTypeRow> storedItems;
    
    private List<DataTypeRow> realTimeItems;
    
    private List<DataTypeRow> setupItems;
    
    private List<OptionRow> optionItems;

    /**
     * @return storedItems
     */
    public List<DataTypeRow> getStoredItems() {
        return storedItems;
    }

    /**
     * @param storedItems セットする storedItems
     */
    @HorizontalRecords(tableLabel = "（１）蓄積系データ", recordClass = DataTypeRow.class, 
            headerRow = 2, terminal = RecordTerminal.Border)
    public void setStoredItems(List<DataTypeRow> storedItems) {
        this.storedItems = storedItems;
    }

    /**
     * @return realTimeItems
     */
    public List<DataTypeRow> getRealTimeItems() {
        return realTimeItems;
    }

    /**
     * @param realTimeItems セットする realTimeItems
     */
    @HorizontalRecords(tableLabel = "（２）速報系データ", recordClass = DataTypeRow.class, 
            headerRow = 2, terminal = RecordTerminal.Border)
    public void setRealTimeItems(List<DataTypeRow> realTimeItems) {
        this.realTimeItems = realTimeItems;
    }

    /**
     * @return setupItems
     */
    public List<DataTypeRow> getSetupItems() {
        return setupItems;
    }

    /**
     * @param setupItems セットする setupItems
     */
    @HorizontalRecords(tableLabel = "（３）セットアップデータ", recordClass = DataTypeRow.class, 
            headerRow = 2, terminal = RecordTerminal.Border)
    public void setSetupItems(List<DataTypeRow> setupItems) {
        this.setupItems = setupItems;
    }

    /**
     * @return optionItems
     */
    public List<OptionRow> getOptionItems() {
        return optionItems;
    }

    /**
     * @param optionItems セットする optionItems
     */
    @HorizontalRecords(tableLabel = "■JV-Link JVOpenメソッドで指定可能なoptionとdataspec（JVData データ種別ID)の関係", 
            recordClass = OptionRow.class, terminal = RecordTerminal.Border)
    public void setOptionItems(List<OptionRow> optionItems) {
        this.optionItems = optionItems;
    }
    
}
