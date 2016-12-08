package chapter6;

import java.util.function.Function;

/**
 * Created by hadeslee on 2016-12-09.
 */
public class Reverse {
    interface ReverseType {
        String reverse(String text);
    }

    public static void main(String[] args) {
        ReverseType newText = (textText) -> {
            String tempStr = "";
            for (String part : textText.split(" ")) {
                tempStr = new StringBuffer(part).reverse().toString();
            }
            return tempStr;
        };
        Function<String,String> newText2 = (testText) -> {
            String tempStr = "";
            for (String part : testText.split(" ")) {
                tempStr = new StringBuilder(part).reverse().toString();
            }
            return tempStr;
        };
        System.out.println(newText.reverse("HELLO"));
        System.out.println(newText2.apply("WORLD"));
    }
}


