package chapter4.recipe_04_03;

/**
 * Project: Java8Recipes
 * FileName: recipe04_03
 * Date: 2016-11-10
 * Time: 오전 10:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_03 {
    public static void main(String[] args) {
        int int1 = 1;
        int int2 = 10;
        int int3 = -5;

        System.out.println(int1 == int2);
        System.out.println(int3 == int1);
        System.out.println(int1 == int1);
        System.out.println(int1 > int3);
        System.out.println(int2 < int3);
    }
}
