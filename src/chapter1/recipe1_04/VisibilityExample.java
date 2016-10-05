package chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: VisibilityExample
 * Date: 2016-10-05
 * Time: 오전 9:02
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class VisibilityExample {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.setLong(32768);
        tc.visibleFromEntirePackage = 3.141592635;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFromEntirePackage);
    }
}
