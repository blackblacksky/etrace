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

package io.etrace.api.model.po;

import io.etrace.common.constant.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * base persistent object for visualization object
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseVisualizationObject extends BasePersistentObject {

    @Nullable
    private String title;
    private String description;
    private String status = Status.Active.name();

    private Long favoriteCount;
    private Long viewCount;
    private Boolean isStar;

    @Nullable
    private String createdBy;
    @Nullable
    private String updatedBy;

    @Column(unique = true, nullable = false)
    @Nullable
    private String globalId;
    private Boolean adminVisible;
}

