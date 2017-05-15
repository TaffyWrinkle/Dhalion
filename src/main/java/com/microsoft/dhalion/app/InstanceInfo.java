// Copyright 2017 Microsoft. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.microsoft.dhalion.app;

/**
 * An {@link InstanceInfo} holds information pertinent to a specific instance of a component of a
 * distributed application. For e.g. has task id of a bolt instance for a Storm or Heron topology.
 */
public class InstanceInfo {
  protected String name;

  public String getName() {
    return name;
  }
}
