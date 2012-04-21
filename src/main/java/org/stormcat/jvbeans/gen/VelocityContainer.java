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

import java.io.IOException;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.stormcat.commons.constants.Charset;

/**
 * @author a.yamada
 *
 */
public class VelocityContainer {

    private VelocityContext context;
    
    private Template template;
    
    /**
     * コンストラクタ
     * @param templatePath
     * @param charset
     */
    public VelocityContainer(String templatePath, Charset charset) {
        try {
            Velocity.init();
            context = new VelocityContext();
            template = Velocity.getTemplate(templatePath, charset.getValue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void addParameter(String key, Object value) {
        context.put(key, value);
    }
    
    @Override
    public String toString() {
        StringWriter sw = new StringWriter();
        try {
            template.merge(context, sw);
            return sw.toString();
        } catch (ResourceNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ParseErrorException e) {
            throw new RuntimeException(e);
        } catch (MethodInvocationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
