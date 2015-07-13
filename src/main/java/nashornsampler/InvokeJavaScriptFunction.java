package nashornsampler; /**
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

import javax.script.*;

public class InvokeJavaScriptFunction {
    public static void main(String... args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        CompiledScript compiledScript = ((Compilable) engine).compile("function hello(message){print(message);}");
        compiledScript.eval();
        Invocable invocable = (Invocable) engine;
        // prints "Hello Nashorn"
        invocable.invokeFunction("hello", "Hello Nashorn");
    }

    public void hello() {
        System.out.println("Hello Nashorn");
    }
}
