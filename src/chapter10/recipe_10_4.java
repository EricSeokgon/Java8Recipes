package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_4
 * Date: 2017-01-12
 * Time: 오전 8:33
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_10_4 {
    private void copyOnWriteSolution() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        startUpdatingThread(list);
        list.stream().forEach((element) -> {
            System.out.println("Element :" + element);
        });
        stopUpdatingThread();
    }

    private void synchronizedListSolution() {
        final List<String> list = Collections.synchronizedList(new ArrayList<String>());
        startUpdatingThread(list);
        synchronized (list) {
            list.stream().forEach((element) -> {
                System.out.println("Element :" + element);
            });
        }
        stopUpdatingThread();
    }

    private void startUpdatingThread(List<String> list) {
    }

    private void stopUpdatingThread() {
    }
}
