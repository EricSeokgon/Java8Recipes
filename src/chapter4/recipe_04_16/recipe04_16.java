package chapter4.recipe_04_16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Project: Java8Recipes
 * FileName: recipe04_16
 * Date: 2016-11-23
 * Time: 오후 2:28
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_16 {
    public static void main(String[] args) {
        //Parse a string to form a Date-Time object
        LocalDate ld = LocalDate.parse("2016-11-23");
        LocalDateTime ldt = LocalDateTime.parse("2016-11-23T14:30:00");
        System.out.println("Parsed Date : " + ld);
        System.out.println("Parsed Date : " + ldt);

        //Using a different Parser
        LocalDate ldt2 = LocalDate.parse("2016-11-23", DateTimeFormatter.ISO_DATE);
        System.out.println("Different Parser : " + ldt2);
    }
}
