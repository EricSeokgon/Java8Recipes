package chapter3.recipe_03_05;

/**
 * Project: Java8Recipes
 * FileName: recipe03_05
 * Date: 2016-10-31
 * Time: 오전 9:02
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_05 {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "Java8";
        String result = one.concat(" ".concat(two));
        System.out.println(result);

        String result2 = one + " " + two;
        System.out.println(result2);

        StringBuffer buffer = new StringBuffer();
        buffer.append(one).append(" ").append(two);
        String result3 = buffer.toString();
        System.out.println(result3);
    }
}
