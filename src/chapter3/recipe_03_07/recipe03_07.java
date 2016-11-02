package chapter3.recipe_03_07;

/**
 * Project: Java8Recipes
 * FileName: recipe03_07
 * Date: 2016-11-02
 * Time: 오전 10:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_07 {
    public static void main(String[] args) {
        String str = "Break down into chars";
        System.out.println(str);
        for (char chr : str.toCharArray()) {
            System.out.println(chr);
        }

        for (int x = 0; x < str.length() - 1; x++) {
            System.out.println(str.charAt(x));
        }
    }
}
