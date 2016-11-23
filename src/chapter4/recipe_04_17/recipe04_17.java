package chapter4.recipe_04_17;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * Project: Java8Recipes
 * FileName: recipe04_17
 * Date: 2016-11-23
 * Time: 오후 2:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_17 {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        LocalDateTime now = LocalDateTime.now();
        String output = now.format(dateFormatter);
        System.out.println(output);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/dd/YY HH:mm:ss");
        String output2 = now.format(dateTimeFormatter2);
        System.out.println(output2);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("hh 'o''clock' a, zzzz");
        ZonedDateTime zdt = ZonedDateTime.now();
        String outout3 = zdt.format(dateTimeFormatter3);
        System.out.println(outout3);

        //Create new clendar
        Calendar cal = Calendar.getInstance();

        //Create instance of simpleDateFormat class using pattern
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM dd yyyy");
        String result = null;
    }
}
