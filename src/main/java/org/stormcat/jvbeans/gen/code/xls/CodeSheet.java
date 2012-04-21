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

import java.util.List;

import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.RecordTerminal;
import net.java.amateras.xlsbeans.annotation.Sheet;

/**
 * @author a.yamada
 *
 */
@Sheet(name = "コード表")
public class CodeSheet {

    private List<Code2001> row2001Items;
    
    private List<Code2002> row2002Items;
    
    private List<Code2003> row2003Items;
    
    private List<Code2005> row2005Items;
    
    private List<Code2006> row2006Items;
    
    private List<Code2007> row2007Items;
    
    private List<Code2008> row2008Items;
    
    private List<Code2009> row2009Items;
    
    private List<Code2010> row2010Items;
    
    private List<Code2011> row2011Items;
    
    private List<Code2101> row2101Items;
    
    private List<Code2102> row2102Items;
    
    private List<Code2201> row2201Items;
    
    private List<Code2202> row2202Items;
    
    private List<Code2203> row2203Items;
    
    private List<Code2204> row2204Items;

    private List<Code2301> row2301Items;
    
    private List<Code2302> row2302Items;
    
    private List<Code2303> row2303Items;
    
    /**
     * @return row2001Items
     */
    public List<Code2001> getRow2001Items() {
        return row2001Items;
    }

    /**
     * @param row2001Items セットする row2001Items
     */
    @HorizontalRecords(tableLabel = "2001.競馬場コード", recordClass = Code2001.class, terminal = RecordTerminal.Border)
    public void setRow2001Items(List<Code2001> row2001Items) {
        this.row2001Items = row2001Items;
    }
    
    /**
     * @return row2002Items
     */
    public List<Code2002> getRow2002Items() {
        return row2002Items;
    }

    /**
     * @param row2002Items セットする row2002Items
     */
    @HorizontalRecords(tableLabel = "2002.曜日コード", recordClass = Code2002.class, terminal = RecordTerminal.Border)
    public void setRow2002Items(List<Code2002> row2002Items) {
        this.row2002Items = row2002Items;
    }
    
    /**
     * @return row2003Items
     */
    public List<Code2003> getRow2003Items() {
        return row2003Items;
    }

    /**
     * @param row2003Items セットする row2003Items
     */
    @HorizontalRecords(tableLabel = "2003.グレードコード", recordClass = Code2003.class, terminal = RecordTerminal.Border)
    public void setRow2003Items(List<Code2003> row2003Items) {
        this.row2003Items = row2003Items;
    }

    
    
    /**
     * @return row2005Items
     */
    public List<Code2005> getRow2005Items() {
        return row2005Items;
    }

    /**
     * @param row2005Items セットする row2005Items
     */
    @HorizontalRecords(tableLabel = "2005.競走種別コード", recordClass = Code2005.class, terminal = RecordTerminal.Border)
    public void setRow2005Items(List<Code2005> row2005Items) {
        this.row2005Items = row2005Items;
    }
    

    /**
     * @return row2006Items
     */
    public List<Code2006> getRow2006Items() {
        return row2006Items;
    }

    /**
     * @param row2006Items セットする row2006Items
     */
    @HorizontalRecords(tableLabel = "2006.競走記号コード", recordClass = Code2006.class, terminal = RecordTerminal.Border)
    public void setRow2006Items(List<Code2006> row2006Items) {
        this.row2006Items = row2006Items;
    }

    /**
     * @return row2007Items
     */
    public List<Code2007> getRow2007Items() {
        return row2007Items;
    }

    /**
     * @param row2007Items セットする row2007Items
     */
    @HorizontalRecords(tableLabel = "2007.競走条件コード", recordClass = Code2007.class, terminal = RecordTerminal.Border)
    public void setRow2007Items(List<Code2007> row2007Items) {
        this.row2007Items = row2007Items;
    }

    /**
     * @return row2008Items
     */
    public List<Code2008> getRow2008Items() {
        return row2008Items;
    }

    /**
     * @param row2008Items セットする row2008Items
     */
    @HorizontalRecords(tableLabel = "2008.重量種別コード", recordClass = Code2008.class, terminal = RecordTerminal.Border)
    public void setRow2008Items(List<Code2008> row2008Items) {
        this.row2008Items = row2008Items;
    }

    /**
     * @return row2009Items
     */
    public List<Code2009> getRow2009Items() {
        return row2009Items;
    }

    /**
     * @param row2009Items セットする row2009Items
     */
    @HorizontalRecords(tableLabel = "2009.トラックコード", recordClass = Code2009.class, terminal = RecordTerminal.Border)
    public void setRow2009Items(List<Code2009> row2009Items) {
        this.row2009Items = row2009Items;
    }

    /**
     * @return row2010Items
     */
    public List<Code2010> getRow2010Items() {
        return row2010Items;
    }

    /**
     * @param row2010Items セットする row2010Items
     */
    @HorizontalRecords(tableLabel = "2010.馬場状態コード", recordClass = Code2010.class, terminal = RecordTerminal.Border)
    public void setRow2010Items(List<Code2010> row2010Items) {
        this.row2010Items = row2010Items;
    }
    
    

    /**
     * @return row2011Items
     */
    public List<Code2011> getRow2011Items() {
        return row2011Items;
    }

    /**
     * @param row2011Items セットする row2011Items
     */
    @HorizontalRecords(tableLabel = "2011.天候コード", recordClass = Code2011.class, terminal = RecordTerminal.Border)
    public void setRow2011Items(List<Code2011> row2011Items) {
        this.row2011Items = row2011Items;
    }
    
    /**
     * @return row2101Items
     */
    public List<Code2101> getRow2101Items() {
        return row2101Items;
    }

    /**
     * @param row2101Items セットする row2101Items
     */
    @HorizontalRecords(tableLabel = "2101.異常区分コード", recordClass = Code2101.class, terminal = RecordTerminal.Border)
    public void setRow2101Items(List<Code2101> row2101Items) {
        this.row2101Items = row2101Items;
    }
    
    

    /**
     * @return row2102Items
     */
    public List<Code2102> getRow2102Items() {
        return row2102Items;
    }

    /**
     * @param row2102Items セットする row2102Items
     */
    @HorizontalRecords(tableLabel = "2102.着差コード", recordClass = Code2102.class, terminal = RecordTerminal.Border)
    public void setRow2102Items(List<Code2102> row2102Items) {
        this.row2102Items = row2102Items;
    }

    /**
     * @return row2201Items
     */
    public List<Code2201> getRow2201Items() {
        return row2201Items;
    }

    /**
     * @param row2201Items セットする row2201Items
     */
    @HorizontalRecords(tableLabel = "2201.品種コード", recordClass = Code2201.class, terminal = RecordTerminal.Border)
    public void setRow2201Items(List<Code2201> row2201Items) {
        this.row2201Items = row2201Items;
    }

    /**
     * @return row2202Items
     */
    public List<Code2202> getRow2202Items() {
        return row2202Items;
    }

    /**
     * @param row2202Items セットする row2202Items
     */
    @HorizontalRecords(tableLabel = "2202.性別コード", recordClass = Code2202.class, terminal = RecordTerminal.Border)
    public void setRow2202Items(List<Code2202> row2202Items) {
        this.row2202Items = row2202Items;
    }

    /**
     * @return row2203Items
     */
    public List<Code2203> getRow2203Items() {
        return row2203Items;
    }

    /**
     * @param row2203Items セットする row2203Items
     */
    @HorizontalRecords(tableLabel = "2203.毛色コード", recordClass = Code2203.class, terminal = RecordTerminal.Border)
    public void setRow2203Items(List<Code2203> row2203Items) {
        this.row2203Items = row2203Items;
    }
    
    /**
     * @return row2204Items
     */
    public List<Code2204> getRow2204Items() {
        return row2204Items;
    }

    /**
     * @param row2204Items セットする row2204Items
     */
    @HorizontalRecords(tableLabel = "2204.馬記号コード", recordClass = Code2204.class, terminal = RecordTerminal.Border)
    public void setRow2204Items(List<Code2204> row2204Items) {
        this.row2204Items = row2204Items;
    }

    /**
     * @return row2301Items
     */
    public List<Code2301> getRow2301Items() {
        return row2301Items;
    }

    /**
     * @param row2301Items セットする row2301Items
     */
    @HorizontalRecords(tableLabel = "2301.東西所属コード", recordClass = Code2301.class, terminal = RecordTerminal.Border)
    public void setRow2301Items(List<Code2301> row2301Items) {
        this.row2301Items = row2301Items;
    }

    /**
     * @return row2302Items
     */
    public List<Code2302> getRow2302Items() {
        return row2302Items;
    }

    /**
     * @param row2302Items セットする row2302Items
     */
    @HorizontalRecords(tableLabel = "2302.騎乗資格コード", recordClass = Code2302.class, terminal = RecordTerminal.Border)
    public void setRow2302Items(List<Code2302> row2302Items) {
        this.row2302Items = row2302Items;
    }

    /**
     * @return row2303Items
     */
    public List<Code2303> getRow2303Items() {
        return row2303Items;
    }

    /**
     * @param row2303Items セットする row2303Items
     */
    @HorizontalRecords(tableLabel = "2303.騎手見習コード", recordClass = Code2303.class, terminal = RecordTerminal.Border)
    public void setRow2303Items(List<Code2303> row2303Items) {
        this.row2303Items = row2303Items;
    }
    
    
    
}
