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
package org.stormcat.jvbeans.gen.util;

import org.stormcat.jvbeans.gen.JvDataXlsLoader;

/**
 * @author a.yamada
 *
 */
public class JvBeansGenUtil {

    private static String version = "340";

    private JvBeansGenUtil() {
        throw new AssertionError();
    }

    public static void setVersion(String v) {
        synchronized (version) {
            version = v;
        }
    }

    /**
     * JV-Data340.xlsから対象のシートのデータバインドオブジェクトを取得します。
     * @param <T> バインド型パラメータ
     * @param sheetClass バインドクラス
     * @return データバインドオブジェクト
     */
    public static <T> T getSheet(Class<T> sheetClass) {
        JvDataXlsLoader loader = new JvDataXlsLoader(String.format("src/main/resources/JV-Data%s.xls", version));
        return loader.getSheet(sheetClass);
    }

}
