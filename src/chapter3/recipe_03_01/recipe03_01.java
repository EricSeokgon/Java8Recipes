package chapter3.recipe_03_01;

/**
 * Project: Java8Recipes
 * FileName: recipe03_01
 * Date: 2016-10-26
 * Time: 오전 10:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_01 {
    public static void main(String[] args) {
        String originalString = "This is th eoriginal String";
        System.out.println(originalString.substring(0, originalString.length()));
        System.out.println(originalString.substring(5, 20));
        System.out.println(originalString.substring(12));
    }
}
