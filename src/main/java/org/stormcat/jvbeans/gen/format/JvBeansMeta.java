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
package org.stormcat.jvbeans.gen.format;

import java.util.ArrayList;
import java.util.List;

import org.stormcat.commons.lang.StringUtil;

/**
 * @author a.yamada
 *
 */
public class JvBeansMeta {

    private String name;
    
    private String itemName;
    
    private Integer position;
    
    private Integer byteLength;
    
    private Integer totalByteLength;
    
    private String type;
    
    private String repeatCount;
    
    private Float correction;
    
    private List<JvBeansMeta> childMetaList;
    
    public JvBeansMeta() {
        this.childMetaList = new ArrayList<JvBeansMeta>();
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
    public void setName(String name) {
        this.name = name;
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
    public void setItemName(String itemName) {
        this.itemName = itemName.replace("<", "").replace(">", "");
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position セットする position
     */
    public void setPosition(Integer position) {
        this.position = position;
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
    public void setTotalByteLength(Integer totalByteLength) {
        this.totalByteLength = totalByteLength;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type セットする type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * @return childMetaList
     */
    public List<JvBeansMeta> getChildMetaList() {
        return childMetaList;
    }

    /**
     * @param childMetaList セットする childMetaList
     */
    public void setChildMetaList(List<JvBeansMeta> childMetaList) {
        this.childMetaList = childMetaList;
    }
    
    public void addChildMeta(JvBeansMeta childMeta) {
        childMetaList.add(childMeta);
    }
    
    /**
     * @return repeatCount
     */
    public String getRepeatCount() {
        return repeatCount;
    }

    /**
     * @param repeatCount セットする repeatCount
     */
    public void setRepeatCount(String repeatCount) {
        this.repeatCount = repeatCount;
    }
    
    /**
     * @return correction
     */
    public Float getCorrection() {
        return correction;
    }

    /**
     * @param correction セットする correction
     */
    public void setCorrection(Float correction) {
        this.correction = correction;
    }

    public boolean isRepeat() {
        return StringUtil.isNotBlank(repeatCount);
    }
    
    public boolean isJoin() {
        return itemName.startsWith("<")  && itemName.endsWith(">");
    }

    public String getGetterName() {
        return String.format("get%s%s", name.substring(0, 1).toUpperCase(), name.substring(1, name.length()));
    }
    
    public String getSetterName() {
        return String.format("set%s%s", name.substring(0, 1).toUpperCase(), name.substring(1, name.length()));
    }

}
