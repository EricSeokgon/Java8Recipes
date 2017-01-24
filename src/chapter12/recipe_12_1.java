package chapter12;

/**
 * Project: Java8Recipes
 * FileName: recipe_12_1
 * Date: 2017-01-25
 * Time: 오전 8:30
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_12_1 {
    public static void main(String[] args) {
        int x = 0;
        for (int c = 0; c <= 0x10FFFF; c++) {
            if (Character.isDigit(c)) {
                ++x;
                System.out.printf("Codepoint: 0x%04X\tCharacter: %c\tDigit: %d\tName: %s\n", c, c,
                        Character.digit(c, 10), Character.getName(c));
            }
        }
        System.out.printf("Total digits: %d\n", x);
    }
}
