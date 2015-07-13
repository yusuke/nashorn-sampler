/**
 * Copyright (c) 2015 Yusuke Yamamoto
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nashornsampler;

import javax.script.*;

public class InvokeJavaStaticMethod {
    public static void main(String... args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        // works also with "js" / "javascript"
        ScriptEngine engine = manager.getEngineByName("nashorn");
        // prints "Hello Nashorn"
        engine.eval("Java.type('nashornsampler.InvokeJavaStaticMethod').hello('Hello Nashorn');");
    }

    public static void hello(String message) {
        System.out.println(message);
    }
}
