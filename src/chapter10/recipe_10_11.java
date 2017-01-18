package chapter10;

import java.util.concurrent.atomic.DoubleAdder;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_11
 * Date: 2017-01-19
 * Time: 오전 8:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_10_11 {
    DoubleAdder da = new DoubleAdder();
    public static void main(String[] args) {

    private void start() {
        DoubleAdder da = null;
        Thread thread1 = new Thread(() -> {
            for (int i1 = 0; i1 < 10; i1++) {
                da.add(i1);
                System.out.println("Adding " + i1);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i1 = 0; i1 < 10; i1++) {
                da.add(i1);
                System.out.println("Adding " + i1);
            }
        });
        thread1.start();
        thread2.start();
        try {
            System.out.println("Sleep while summing....");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The sum is: " + da.doubleValue());
    }
}
    }

