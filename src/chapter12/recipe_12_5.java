package chapter12;

/**
 * Created by hadeslee on 2017-01-28.
 */
public class recipe_12_5 {
    public static void main(String[] args) {
        String enText = "The fat cat sat on the mat with a brown rat.";
        String jaText = "Fight \uDBC3\uDE08\uDBC2\uDCC8\uDBC1\uDD3D\uDBC0\uDF5A!!";
        boolean found = false;
        String enRegEx = "^The \\w+ cat.*";
        String jaRegEx = ".*\uDBC3\uDE08\uDBC2\uDCC8.*";
        String jaRegExEscaped = ".*\u6587\u5B57.*";
        found = enText.matches(enRegEx);
        if (found) {
            System.out.printf("Matches %s.\n", enRegEx);
        }
        found = jaText.matches(jaRegEx);
        if (found) {
            System.out.printf("Matches %s.\n", jaRegEx);
        }
        found = jaText.matches(jaRegExEscaped);
        if (found) {
            System.out.printf("Matches %s.\n", jaRegExEscaped);
        }
    }
}
