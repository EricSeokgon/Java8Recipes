package chapter4.recipe_04_09;

import java.time.Month;
import java.time.YearMonth;

/**
 * Project: Java8Recipes
 * FileName: recipe04_09
 * Date: 2016-11-15
 * Time: 오전 9:53
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_09 {
    public static void main(String[] args) {
        YearMonth yearMo = YearMonth.now();
        System.out.println("Current Year and moneth: " + yearMo);
        YearMonth specifiedDate = YearMonth.of(2016, Month.NOVEMBER);
        System.out.println("Specidied Month-Day: " + specifiedDate);
    }
}
