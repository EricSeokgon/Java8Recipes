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

        System.out.println(int1 == int2); //result : false
        System.out.println(int3 == int1); //result : false
        System.out.println(int1 == int1); //result : true
        System.out.println(int1 > int3); //result : true
        System.out.println(int2 < int3); //result : false

        System.out.println("Compare method -> int3 and int1: "+Integer.compare(int3, int1));
        // result -1

        System.out.println("Compare method -> int2 and int1: "+Integer.compare(int2, int1));
        // result 1
    }
}
