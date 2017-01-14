package chapter10;

/**
 * Created by hadeslee on 2017-01-15.
 */
public class recipe_10_7 {
    private final Object objectToSync = new Object();

    private void start() {
        loadItems();
        Thread inventoryThread = new Thread(() -> {
            System.out.println("Loading Inventory from Database...");
            loadInventory();
            synchronized (objectToSync) {
                objectToSync.notify();
            }
        });
        synchronized (objectToSync) {
            inventoryThread.start();
            try {
                objectToSync.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread ordersThread = new Thread(() -> {
            System.out.println("Loading Orders from XML Web service...");
            loadOrders();
            synchronized (objectToSync) {
                objectToSync.notify();
            }
        });
        synchronized (objectToSync) {
            ordersThread.start();
            try {
                objectToSync.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
