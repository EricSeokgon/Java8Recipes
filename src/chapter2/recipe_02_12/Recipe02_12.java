package chapter2.recipe_02_12;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Project: Java8Recipes
 * FileName: Recipe02_12
 * Date: 2016-10-25
 * Time: 오전 9:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Recipe02_12 {
    public static void loadInlineJs() {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine nashorn = sem.getEngineByName("nashorn");
        try {
            nashorn.eval("print('this is being printed with JavaSript');");
        } catch (ScriptException ex) {
            Logger.getLogger(Recipe02_12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        loadInlineJs();
    }
}
