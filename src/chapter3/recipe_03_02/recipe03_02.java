package chapter3.recipe_03_02;

/**
 * Project: Java8Recipes
 * FileName: recipe03_02
 * Date: 2016-10-27
 * Time: 오전 9:01
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_02 {
    public static void main(String[] args) {
        String one = "one";
        String two = "two";

        String var1 = "one";
        String var2 = "two";

        String pieceone = "o";
        String piecetwo = "ne";

        // Comparison is equal
        if (one.equals(var1)) {
            System.out.println("String one equals var1 using equals");
        }

        //Comparison is NOT equal
        if (one.equals(two)) {
            System.out.println("String one equals two using equals");
        }

        //Comparison is NOT equal
        if (two.equals(var2)) {
            System.out.println("String two equals var2 using equals");
        }

        //Comparison is equal, but is not directly comparing string values using
        if (one == var1) {
            System.out.println("String onr equals var using ==");
        }

        //Comparison is equal
        if (two.equalsIgnoreCase(var2)) {
            System.out.println("String two equals var2 using equalsIgnoreCase");
        }

        System.out.println("Trying to use == on String that are pieced together");

        String piecedTogether = pieceone + piecetwo;

        // Comparison is equal
        if (one.equals(piecedTogether)) {
            System.out.println("The strings contain the same value using equals");
        }

        // Comparison is NOT equal using ==
        if (one == piecedTogether) {
            System.out.println("The string contain the same value using == ");
        }

        // Comparison is equal
        if (one.compareTo(var1) == 0) {
            System.out.println("One is equal to var1 using compareTo()");
        }
    }
}

