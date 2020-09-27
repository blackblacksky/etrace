/*
 * Copyright 2020 etrace.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.etrace.common.pipeline.impl;

import io.etrace.common.pipeline.Filter;

import java.util.Map;

public class DefaultMatchAllFilter implements Filter {
    public static final String NAME = "default";

    public DefaultMatchAllFilter() {
    }

    public DefaultMatchAllFilter(String name) {
    }

    @Override
    public void init(Map<String, Object> params) {

    }

    @Override
    public Object match(Object obj) {
        return obj;
    }

    @Override
    public String name() {
        return NAME;
    }
}
