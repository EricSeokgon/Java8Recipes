package chapter10;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_10
 * Date: 2017-01-18
 * Time: 오전 8:30
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_10_9 {
    public static void main(String[] args) {

        AtomicLong orderIdGenerator = new AtomicLong(0);
        for (int i = 0; i < 10; i++) {
            Thread orderCreationThread = new Thread(() -> {
                for (int i1 = 0; i1 < 10; i1++) {
                    createOrder(Thread.currentThread().getName());
                }
            });
            orderCreationThread.setName("Order Creation Thread " + i);
            orderCreationThread.start();
        }
    }

    private static void createOrder(String name) {
        AtomicLong orderIdGenerator = null;
        long orderId = orderIdGenerator.incrementAndGet();
        Order order = new Order(name, orderId);
        Queue<Order> orders = null;
        orders.add(order);
    }
}
