package chapter4.recipe_04_14;

import java.time.LocalDate;

/**
 * Project: Java8Recipes
 * FileName: recipe04_14
 * Date: 2016-11-21
 * Time: 오전 10:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe04_14 {
    public static void compareDates(LocalDate ldt1,
                                    LocalDate ldt2) {
        int comparison = ldt1.compareTo(ldt2);
        if (comparison > 0) {
            System.out.println(ldt1 + " is larger than " + ldt2);
        } else if (comparison < 0) {
            System.out.println(ldt1 + " is smaller than " + ldt2);
        } else {
            System.out.println(ldt1 + " is equal to " + ldt2);
        }
    }
}
