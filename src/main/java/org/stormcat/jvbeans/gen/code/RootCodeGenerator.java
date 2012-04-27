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
package org.stormcat.jvbeans.gen.code;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stormcat.jvbeans.common.reflect.ClassUtil;
import org.stormcat.jvbeans.common.reflect.MethodUtil;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author a.yamada
 *
 */
public class RootCodeGenerator {

    private static Logger logger = LoggerFactory.getLogger(RootCodeGenerator.class);

    private static int[] no = new int[]{2001, 2002, 2003, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2101,
        2102, 2201, 2202, 2203, 2204, 2301, 2302, 2303};

    private static final String FQDN = "org.stormcat.jvbeans.gen.code.CodeGenerator%s";

    /**
     * @param args
     */
    public static void main(String[] args) {

        if (args.length < 1) {
            throw new IllegalArgumentException("format version not specified.");
        }
        JvBeansGenUtil.setVersion(args[0]);

        for (int formatNo : no) {
            Class<?> clazz = ClassUtil.forName(String.format(FQDN, formatNo));
            Method method = MethodUtil.getDeclareMethod(clazz.getSuperclass().getSuperclass(), "createSourceFile");
            method.setAccessible(true);
            MethodUtil.invoke(method, ClassUtil.newInstance(clazz), null, new Object[]{});
            logger.info(String.format("%d のコードを生成しました！！", formatNo));
        }

    }

}
