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

/**
 * @author a.yamada
 *
 */
public class DataTypeCode {

   private String name;
    
    private String display;
    
    private String value;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * @param display セットする display
     */
    public void setDisplay(String display) {
        this.display = display;
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
    public void setValue(String value) {
        this.value = value;
    }
    
}
