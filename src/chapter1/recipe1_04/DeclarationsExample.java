package chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: DeclarationsExample
 * Date: 2016-10-04
 * Time: 오전 9:01
 * Author: hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DeclarationsExample {
    public static void main(String[] args) {
        boolean BooleanVal = true; /*Default is false*/

        char charval = 'G'; /* Unicode UTF-16 */
        charval = '\u0490'; /* Ukrainian letter Ghe(􀇱) */

        byte byteval; /* 8 bits, -127 to 127 */
        short shortval; /* 16 bits, -32,768 to 32,768 */
        int intval; /* 32 bits, -2147483648 to 2147483647 */
        long longval; /* 64 bits, -(2^64) to 2^64 - 1 */

        float floatval = 10.123456F; /* 32-bit IEEE 754 */
        double doubleval = 10.12345678987654; /* 64-bit IEEE 754 */

        String message = "Hades the corner where you are!";
        message = message.replace("Hades", "Hadeslee");
    }
}
