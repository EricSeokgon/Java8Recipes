package chapter9;

/**
 * Created by hadeslee on 2017-01-07.
 */
public class Throwing {
    private void start() {
        try {
            callSomeMethodThatMightThrow(null);
        } catch (IllegalArgumentException e) {
            System.out.println("There was an illegal argument exception!");
        }
    }

    private void callSomeMethodThatMightThrow(Object o) {
    }

    private void callSomeFunctionThatMightThrow(Object o) {
        if (o == null) throw new NullPointerException("The object is null");
    }
}
