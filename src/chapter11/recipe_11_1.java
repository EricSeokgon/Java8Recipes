package chapter11;

/**
 * Created by hadeslee on 2017-01-21.
 */
public class recipe_11_1 {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
