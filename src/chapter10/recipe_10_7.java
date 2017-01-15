package chapter10;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hadeslee on 2017-01-15.
 */
public class recipe_10_7 {
    CountDownLatch latch = new CountDownLatch(2);
    private void start() {
        loadItems();
        Thread inventoryThread = new Thread(() -> {
            System.out.println("Loading Inventory from Database...");
            loadInventory();
            latch.countDown();
        });
        inventoryThread.start();
        Thread ordersThread = new Thread(() -> {
            System.out.println("Loading Orders from XML Web service...");
            loadOrders();
            latch.countDown();
        });
        ordersThread.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        processOrders();
    }

    private void processOrders() {
    }

    private void loadOrders() {
    }

    private void loadInventory() {
    }

    private void loadItems() {
    }
}
