// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.api.v13;

import com.cloudera.api.DataView;
import com.cloudera.api.model.ApiReplicationState;
import com.cloudera.api.v11.ReplicationsResourceV11;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import static com.cloudera.api.Parameters.DATA_VIEW;
import static com.cloudera.api.Parameters.DATA_VIEW_DEFAULT;

public interface ReplicationsResourceV13 extends ReplicationsResourceV11 {
  /**
   * returns the replication state. for example if incremental export
   * is enabled, etc
   * @param view view to materialize
   * @return replicate state object.
   */
  @GET
  @Path("/replicationState")
  public ApiReplicationState getReplicationState(
      @QueryParam(DATA_VIEW) @DefaultValue(DATA_VIEW_DEFAULT) DataView view);
}
