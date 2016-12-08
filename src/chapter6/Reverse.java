package chapter6;

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
        System.out.println(newText.reverse("HELLO"));
    }
}


