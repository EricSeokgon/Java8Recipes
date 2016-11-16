package chapter4.recipe_04_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Project: Java8Recipes
 * FileName: recipe04_10
 * Date: 2016-11-16
 * Time: 오전 9:15
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_10 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        //atDate(LocalDate) : obtain the local date and time
        LocalDateTime ldt = time.atDate(LocalDate.of(2016, Month.NOVEMBER, 16));
        System.out.println("Local Date Time object : " + ldt);

        //of(int hours, int min) : obtain a specific time
        LocalTime pastTime = LocalTime.of(1, 10);

        //compareTo(LocalTime) : compare two time. Positive
        //return value returned if greater
        System.out.println("Comparing times : " + time.compareTo(pastTime));

        //getHour() : return hour in int value (24-hour format)
        int hour = time.getHour();
        System.out.println("Hour : " + hour);


    }
}
