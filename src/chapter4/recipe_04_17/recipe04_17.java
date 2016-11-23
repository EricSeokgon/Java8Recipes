package chapter4.recipe_04_17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    }
}
