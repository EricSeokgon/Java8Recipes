package chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: TestClass
 * Date: 2016-10-05
 * Time: 오전 8:55
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {
    private long visibleOnlyInThisClass;
    double visibleFromEntirePackage;

    void setLong(long val) {
        visibleOnlyInThisClass = val;
    }

    long getLong() {
        return visibleOnlyInThisClass;
    }
}
