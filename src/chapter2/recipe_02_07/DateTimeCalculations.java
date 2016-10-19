package chapter2.recipe_02_07;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Project: Java8Recipes
 * FileName: LocalDate
 * Date: 2016-10-19
 * Time: 오후 1:34
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DateTimeCalculations {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();

        LocalDate datePlusDays = myDate.plusDays(15);
        System.out.println("Today plus 15 Days : " + datePlusDays);

        LocalDate datePlusWeeks = myDate.plusWeeks(8);
        System.out.println("Today plus 8 weeks : " + datePlusWeeks);

        LocalTime timePlusHours = myTime.plusHours(5);
        System.out.println("Time Plus 5 Hours : " + timePlusHours);

        LocalTime timeMinusMin = myTime.minusMinutes(30);
        System.out.println("Time Minus 30 Minustes : " + timeMinusMin);


    }
}
