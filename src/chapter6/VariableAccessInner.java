package chapter6;

import java.util.function.Consumer;

/**
 * Created by hadeslee on 2016-12-10.
 */
public class VariableAccessInner {
    public String CLASSA = "Class-level A";
    class InnerClass{
        public String CLASSA = "Class-level B";

        void lamdbaInMethod(String passedIn) {
            String METHODA = "Method-level A";
            Consumer<String> l1= x->{
                System.out.println(x);
                System.out.println("CLASSA Value: " + CLASSA);
                System.out.println("METHOD Value: " + METHODA);
            };
            l1.accept(CLASSA);
            l1.accept(passedIn);
        }

        public void lambdaInMethod(String hello) {
        }
    }

    public static void main(String[] args) {
        VariableAccessInner vai = new VariableAccessInner();
        VariableAccessInner.InnerClass inner = vai.new InnerClass();
        inner.lambdaInMethod("Hello");
    }
}
