package br.com.ingenieux.mojo.beanstalk.cmd.env.waitfor;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class WaitForEnvironmentContext {

  String applicationName;
  Integer timeoutMins = 20;
  String statusToWaitFor;
  String environmentRef;
  String health;

  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public Integer getTimeoutMins() {
    return timeoutMins;
  }

  public void setTimeoutMins(Integer timeoutMins) {
    this.timeoutMins = timeoutMins;
  }

  public String getStatusToWaitFor() {
    return statusToWaitFor;
  }

  public void setStatusToWaitFor(String statusToWaitFor) {
    this.statusToWaitFor = statusToWaitFor;
  }

  /**
   * @return the environmentRef
   */
  public String getEnvironmentRef() {
    return environmentRef;
  }

  /**
   * @param environmentRef the environmentRef to set
   */
  public void setEnvironmentRef(String environmentRef) {
    this.environmentRef = environmentRef;
  }

  public String getHealth() {
    return health;
  }

  public void setHealth(String health) {
    this.health = health;
  }
}
