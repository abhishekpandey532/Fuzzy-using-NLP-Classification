
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhishekpandey
 */
public class run_Python {
    public static void main(String[] args) throws ScriptException, IOException {
 
    StringWriter writer = new StringWriter(); //ouput will be stored here
 
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptContext context = new SimpleScriptContext();
 
    context.setWriter(writer); //configures output redirection
    ScriptEngine engine = manager.getEngineByName("python");
    engine.eval(new FileReader("numbers.py"), context);
    System.out.println(writer.toString()); 
} 
    
}
