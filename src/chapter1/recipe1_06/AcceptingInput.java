package chapter1.recipe1_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by hadeslee on 2016-10-09.
 */
public class AcceptingInput {
    public static void main(String[] args) {
        BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));

        String numberAsString = "";
        long numberAsLong = 0;

        boolean numberIsValid = false;
        do {
            /* Ask the user for a number. */
            System.out.println("Please enter a number: ");
            try {
                numberAsString = readIn.readLine();
                System.out.println("You entered " + numberAsString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        /* Convert the number into binary form. */
            try {
                numberAsLong = Long.parseLong(numberAsString);
                numberIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Not a number! ");
            }

        } while (numberIsValid == false);
    }
}
