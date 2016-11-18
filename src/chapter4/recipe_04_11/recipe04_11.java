package chapter4.recipe_04_11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/**
 * Project: Java8Recipes
 * FileName: recipe04_11
 * Date: 2016-11-17
 * Time: 오전 10:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_11 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Locl Date and Time : " + ldt);

        // Obtain the LocalDateTime object of the date 11/17/2016 at 11:11
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.NOVEMBER, 11, 12, 00);

        // Obtain the month from LocalDateTime object
        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        System.out.println("Month : " + month);
        System.out.println("Month Value : " + monthValue);

        //Obtain day of Month, Week, and Year
        int day = ldt.getDayOfMonth();
        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        int dayOfYr = ldt.getDayOfYear();
        System.out.println("Day : " + day);
        System.out.println("Day of week : " + dayOfWeek);
        System.out.println("Dat of Year : " + dayOfYr);

        // Obtain year
        int year = ldt.getYear();
        System.out.println("Date : " + monthValue + "/" + day + "/" + year);

        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        System.out.println("Current Time : " + hour + ":" + minute + ":" + second);

        // Calculation of Months etc.
        LocalDateTime currMinusMonths = ldt.minusMonths(12);
        LocalDateTime currMinusHours = ldt.minusHours(10);
        LocalDateTime currPlusDays = ldt.plusDays(30);
        System.out.println("Current Date and Time Minus 12 Months : " + currMinusMonths);
        System.out.println("Current Date and Time Minus 10 Hours : " + currMinusHours);
        System.out.println("Current Date and Time Plus 30 Days : " + currPlusDays);

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Calendar gCal = Calendar.getInstance();

        // Month is based upon a zero index, January is equal to 0,
        // so we need to add one to the month for it to be in
        // a standard format
        int mh = gCal.get(Calendar.MONTH) + 1;
        int dy = gCal.get(Calendar.DATE);
        int yr = gCal.get(Calendar.YEAR);

        String dateStr = mh + "/" + dy + "/" + yr;
        System.out.println(dateStr);

    }
}
