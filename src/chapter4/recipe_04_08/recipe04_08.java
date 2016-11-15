package chapter4.recipe_04_08;

import java.time.LocalDate;
import java.time.Month;

/**
 * Project: Java8Recipes
 * FileName: recipe04_08
 * Date: 2016-11-15
 * Time: 오전 9:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_08 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 15);
        System.out.println("Date from specified date: " + date);
    }

}
