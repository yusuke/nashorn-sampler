/**
 * Copyright (c) 2015 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nashornsampler;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SimpleNashorn {
    public static void main(String... args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        // works also with "js" / "javascript"
        ScriptEngine engine = manager.getEngineByName("nashorn");
        // prints "Hello Nashorn"
        engine.eval("print('Hello Nashorn');");
    }
}
