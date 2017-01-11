package chapter10;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_3
 * Date: 2017-01-11
 * Time: 오전 9:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_10_3 {
    private void start() {
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 100; i++) {
            startUpdateThread(i, concurrentMap);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        concurrentMap.entrySet().stream().forEach((entry) -> {
            System.out.println("Key :" + entry.getKey() + " Value:" + entry.getValue());
        });
    }

    Random random = new Random();

    private void startUpdateThread(final int i, final ConcurrentMap<Integer, String> concurrentMap) {
        Thread thread = new Thread(() -> {
            int randomInt = random.nextInt(20);
            String previousEntry = concurrentMap.putIfAbsent(randomInt, "Thread # " + i +
                    " has made it!");
            if (previousEntry != null) {
                System.out.println("Thread # " + i + " tried to update it but guess what, we're too late!");
            } else {
                System.out.println("Thread # " + i + " has made it!");
            }
        });
        thread.start();

    }
}
