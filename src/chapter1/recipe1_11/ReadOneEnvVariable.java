package chapter1.recipe1_11;

/**
 * Project: Java8Recipes
 * FileName: ReadOneEnvVariable
 * Date: 2016-10-13
 * Time: 오전 9:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReadOneEnvVariable {
    public static void main(String[] args) {
        if (args.length > 0) {
            String value = System.getenv(args[0]);
            if (value != null) {
                System.out.println(args[0].toUpperCase() + " = " + value);
            } else {
                System.out.println("No such environment variable exists");
            }
        } else {
            System.out.println("No argument passed");
        }
    }
}
