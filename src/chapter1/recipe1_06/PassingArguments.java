package chapter1.recipe1_06;

/**
 * Created by hadeslee on 2016-10-08.
 */
public class PassingArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Arguments that were passed to the program: ");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments passed to the program.");
        }

    }
}
