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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import net.java.amateras.xlsbeans.XLSBeans;
import net.java.amateras.xlsbeans.XLSBeansException;
import net.java.amateras.xlsbeans.annotation.Sheet;

import org.apache.commons.io.IOUtils;
import org.stormcat.jvbeans.exception.JvBeansRuntimeException;

/**
 * @author a.yamada
 */
public class JvDataXlsLoader {
    
    private String xlsPath;
    
    public JvDataXlsLoader(String xlsPath) {
        this.xlsPath = xlsPath;
    }

    public <T> T getSheet(Class<T> sheetType) {
        Sheet sheet = sheetType.getAnnotation(Sheet.class);
        if (sheet == null) {
            throw new RuntimeException(String.format("%s に@Sheetアノテーションが付与されていません。", sheetType.getName()));
        }

        InputStream is = null;
        try {
            is = new FileInputStream(xlsPath);
            return new XLSBeans().load(is, sheetType);
        } catch (FileNotFoundException e) {
            throw new JvBeansRuntimeException(e);
        } catch (XLSBeansException e) {
            throw new JvBeansRuntimeException(e);
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

}
