package chapter6;

/**
 * Project: Java8Recipes
 * FileName: HelloLamdba
 * Date: 2016-12-08
 * Time: 오후 4:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HelloLamdba {
    public interface HelloType {
        void hello(String text);
    }

    public static void main(String[] args) {
        HelloType helloLamdba = (String text) -> {
            System.out.println("Hello " + text);
        };
        helloLamdba.hello("Lamdba");
    }
}
