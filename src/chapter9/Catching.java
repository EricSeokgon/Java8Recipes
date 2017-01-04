package chapter9;

/**
 * Created by hadeslee on 2017-01-04.
 */
public class Catching {

    private void start() {
        System.out.println("Is th string 1234 longer than 5 chars?:" +
                isStringShorterThanFiveCharacters("1234"));
        System.out.println("Is th string 12345 longer than 5 chars?:" +
                isStringShorterThanFiveCharacters("12345"));
        System.out.println("Is th string 123456 longer than 5 chars?:" +
                isStringShorterThanFiveCharacters("123456"));
        System.out.println("Is th string null longer than 5 chars?:" +
                isStringShorterThanFiveCharacters(null));
    }

    private boolean isStringShorterThanFiveCharacters(String aString) {
        try {
            return aString.length() > 5;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("An Exception Occurred!");
            return false;
        }
    }
}
