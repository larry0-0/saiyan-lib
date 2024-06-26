/*
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserve.
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
package co.saiyan.common.uidgen.worker;

import co.saiyan.common.uidgen.impl.DefaultUidGenerator;

import java.util.List;

/**
 * Represents a worker id assigner for {@link DefaultUidGenerator}
 */
public interface WorkNodeService {

    /**
     * Assign worker id for {@link DefaultUidGenerator}
     * 
     * @return assigned worker id
     */
    long assignWorkerId();

    /**
     * get all server ip
     * @return
     */
    List<String> listWorkNodeIp();

    /**
     * remove work node
     * @param workNodeId
     */
    void removeWorkNodeById(Long workNodeId);

    /**
     * remove work node
     * @param hostname
     */
    void removeWorkNodeByHostname(String hostname);
}
