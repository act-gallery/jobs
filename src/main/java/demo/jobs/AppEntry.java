package demo.jobs;

/*-
 * #%L
 * actframework app demo - job scheduling
 * %%
 * Copyright (C) 2018 ActFramework
 * %%
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
 * #L%
 */

import act.Act;
import act.app.ActionContext;
import act.job.OnAppStart;
import act.ws.WsEndpoint;
import org.osgl.mvc.annotation.GetAction;

@WsEndpoint("/ws")
public class AppEntry {

    @GetAction("/~session_id~")
    public String id(ActionContext context) {
        return context.session().id();
    }

    @OnAppStart(async = true)
    public void onAppStartAsync() {
        JobLog.log("onAppStartAsync called");
    }

    @OnAppStart
    public static void onAppStartSync() {
        JobLog.log("onAppStartSync called");
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
