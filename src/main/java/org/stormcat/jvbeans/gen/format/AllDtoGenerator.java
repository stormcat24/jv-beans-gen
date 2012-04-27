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

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.stormcat.jvbeans.common.reflect.FieldUtil;
import org.stormcat.jvbeans.common.reflect.MethodUtil;
import org.stormcat.jvbeans.gen.annotation.MappedRecordTypeId;
import org.stormcat.jvbeans.gen.format.xls.FormatSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class AllDtoGenerator {

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("format version not specified.");
        }
        JvBeansGenUtil.setVersion(args[0]);
        new AllDtoGenerator().createAllDto();
    }


    @SuppressWarnings("unchecked")
    public void createAllDto() {
        FormatSheet formatSheet = JvBeansGenUtil.getSheet(FormatSheet.class);
        Class<?> clazz = formatSheet.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            MappedRecordTypeId annotation = field.getAnnotation(MappedRecordTypeId.class);
            if (annotation != null) {
                String recordTypeId = annotation.value();
                Method getterMethod = FieldUtil.getGetterMethod(field);
                new JvDtoGenerator("org.stormcat.jvbeans.jvlink.definitions.dto", recordTypeId, MethodUtil.invoke(getterMethod, formatSheet, List.class)).createSourceFile();
            }
        }
    }
}
