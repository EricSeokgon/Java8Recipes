package chapter4.recipe_04_02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Project: Java8Recipes
 * FileName: recipe04_02
 * Date: 2016-11-09
 * Time: 오후 2:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_02 {
    public static void formatDouble(double myDouble) {
        NumberFormat numberFormatter = new DecimalFormat("##.000");
        String result = numberFormatter.format(myDouble);
        System.out.println(result);
    }
}
