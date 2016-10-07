package chapter1.recipe1_05;

/**
 * Project: Java8Recipes
 * FileName: StringCoversion
 * Date: 2016-10-07
 * Time: 오전 11:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringCoversion {
    public static void main(String[] args) {
        double pi;
        String strval;

        pi = Double.parseDouble("3.14");
        System.out.println(strval = String.valueOf(pi));
        System.out.println(Double.toString(pi));
    }
}
