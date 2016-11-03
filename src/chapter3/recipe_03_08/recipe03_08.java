package chapter3.recipe_03_08;

/**
 * Project: Java8Recipes
 * FileName: recipe03_08
 * Date: 2016-11-03
 * Time: 오전 9:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_08 {
    public static void main(String[] args) {
        String str = "Here is a long String...let's find a match!";
        boolean result = str.matches("Here is a long String...let's find a match!");
        System.out.println("result : " + result);
        result = str.matches("Here is a long String...");
        System.out.println("result2: " + result);

        str = "true";

        result = str.matches("[Tt]rue");
        System.out.println(result);

        result = str.matches("[Tt]rue|[Ff]alse");
        System.out.println(result);

        str = "I love Java 8!";

        result = str.matches("I love Java [0-9]!");
        System.out.println(result);
    }
}
