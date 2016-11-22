package chapter4.recipe_04_15;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

/**
 * Project: Java8Recipes
 * FileName: recipe04_15
 * Date: 2016-11-22
 * Time: 오전 11:13
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_15 {
    public static void main(String[] args) {
        LocalDate annicersary = LocalDate.of(2000, Month.NOVEMBER, 11);
        LocalDate today = LocalDate.now();
        Period period = Period.between(annicersary, today);
        System.out.println("Number of Day Difference : " + period.getDays());
        System.out.println("Number of Months Difference : " + period.getMonths());
        System.out.println("Number of Year Difference : " + period.getYears());
    }

    //Obtain two instances of the Clendar class
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();




}
