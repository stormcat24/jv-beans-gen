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
package org.stormcat.jvbeans.gen;

import java.io.File;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stormcat.jvbeans.common.constants.Charset;
import org.stormcat.jvbeans.common.io.FileUtil;
import org.stormcat.jvbeans.common.io.PropertyUtil;
import org.stormcat.jvbeans.config.RecordTypeId;

/**
 * ソースコード自動生成の基底となるクラスです。
 * @author a.yamada
 *
 */
public abstract class BaseGenerator {
    
    /** 生成先ディレクトリ */
    protected static final String genarateDir = "target/jv-beans/java/";
    
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
   
    /** パッケージ */
    protected String packageName;
    
    protected BaseGenerator() {
        super();
    }
    
    protected BaseGenerator(String packageName) {
        this.packageName = packageName;
    }

    public void createSourceFile() {
        VelocityContainer container = new VelocityContainer(getTemplate(), Charset.UTF8);
        container.addParameter("packageName", packageName);
        container.addParameter("javadoc", getJavadoc());
        container.addParameter("className", getClassName());
        container.addParameter("year", Calendar.getInstance().get(Calendar.YEAR));
        prepare(container);
        
        String sourceDir = getSourceDir(packageName);
        File dir = new File(sourceDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        
        String filePath = String.format("%s/%s.java", sourceDir, getClassName());
        File source = new File(filePath);
        FileUtil.writeStringToFile(source, container.toString(), Charset.UTF8);
        logger.info(String.format("wrote %s", filePath));
    }
    
    protected String getSourceDir(String packageName) {
        return genarateDir + packageName.replace(".", "/");
    }
    
    /**
     * 対象のレコード種別IDに対応するDtoのクラス名を取得します。
     * @param recordTypeId レコード種別ID
     * @return DTOクラス名
     */
    protected String getDtoName(RecordTypeId recordTypeId) {
        return PropertyUtil.getValue(String.format("%s.%s", "org.stormcat.jvbeans.gen.format", recordTypeId.getValue()), "dto.name");
    }
    
    protected abstract String getTemplate();
    
    protected abstract String getClassName();
    
    protected abstract String getJavadoc();
    
    protected abstract void prepare(VelocityContainer container);
    
}
