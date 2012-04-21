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

import java.util.List;

import org.stormcat.jvbeans.gen.BaseGenerator;
import org.stormcat.jvbeans.gen.VelocityContainer;
import org.stormcat.jvbeans.gen.code.xls.BaseCode;


/**
 * @author a.yamada
 *
 */
public abstract class CodeGenerator <T extends BaseCode> extends BaseGenerator {

    protected CodeGenerator() {
        super("org.stormcat.jvbeans.jvlink.definitions.code");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void prepare(VelocityContainer container) {
        container.addParameter("codeList", getCodeList());
        container.addParameter("type", getType());
    }

    protected abstract List<T> getCodeList();

    protected abstract String getType();
}
