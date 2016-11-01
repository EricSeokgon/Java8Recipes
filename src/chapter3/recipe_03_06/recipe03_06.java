package chapter3.recipe_03_06;

/**
 * Project: Java8Recipes
 * FileName: recipe03_06
 * Date: 2016-11-01
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_06 {
    public static void main(String[] args) {
        String one = "1";
        String two = "2";
        int result = Integer.valueOf(one) + Integer.valueOf(two);
        System.out.println(result);

        int result2 = Integer.parseInt(one) + Integer.parseInt(two);
        System.out.println(result2);
    }
}
