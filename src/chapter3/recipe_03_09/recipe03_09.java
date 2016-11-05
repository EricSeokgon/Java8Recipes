package chapter3.recipe_03_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hadeslee on 2016-11-06.
 */
public class recipe03_09 {
    public static void main(String[] args) {
        String str = "I love Java 8! It is my favorite language. Java 8 is the"
                + "8th version of this great programming language.";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Original : " + str);
        System.out.println("matcher.matches : " + matcher.matches());
        System.out.println("replacement : " + matcher.replaceAll("7"));
    }
}
