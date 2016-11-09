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

    public static void main(String[] args) {
        formatDouble(345.9372);
        formatDouble(.7697);

        NumberFormat format = NumberFormat.getInstance();

        String result = format.format(83.404);
        System.out.println(result);
    }
}
