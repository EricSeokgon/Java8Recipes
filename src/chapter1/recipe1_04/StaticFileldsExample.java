package chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: StaticFileldsExample
 * Date: 2016-10-06
 * Time: 오후 1:07
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StaticFileldsExample {
    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        System.out.println(sd1.oneValueForAllObjects);
        System.out.println(sd2.oneValueForAllObjects);
        sd1.oneValueForAllObjects = true;
        System.out.println(sd1.oneValueForAllObjects);
        System.out.println(sd2.oneValueForAllObjects);

    }
}
