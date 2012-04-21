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
public class OptionRow {

    private String option;
    
    private String dataSpec;

    /**
     * @return option
     */
    public String getOption() {
        return option;
    }

    /**
     * @param option セットする option
     */
    @Column(columnName = "option", optional = true)
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * @return dataSpec
     */
    public String getDataSpec() {
        return dataSpec;
    }

    /**
     * @param dataSpec セットする dataSpec
     */
    @Column(columnName = "option", optional = true, headerMerged = 2)
    public void setDataSpec(String dataSpec) {
        this.dataSpec = dataSpec;
    }
    
}
