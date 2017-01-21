package chapter10;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_5
 * Date: 2017-01-13
 * Time: 오전 8:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_10_5 {
    Lock inventoryLock = new ReentrantLock();

    private boolean fulfillOrder(String itemOrdered, int quantityOrdered, String customerName) {
        try {
            inventoryLock.lock();
            HashMap<Object, Object> inventoryMap = null;
            int currentInventory = (int) inventoryMap.get(itemOrdered);
            if (currentInventory < quantityOrdered) {
                System.out.println("Couldn't fulfill order for " + customerName +
                        " not enough " + itemOrdered + " (" + quantityOrdered + ")");
                return false; // sorry, we sold out
            }
            inventoryMap.put(itemOrdered, currentInventory - quantityOrdered);
            CustomerOrder order = new CustomerOrder(itemOrdered, quantityOrdered, customerName);
            Queue<CustomerOrder> customerOrders = null;
            customerOrders.add(order);
            System.out.println("Order fulfilled for " + customerName + " of " +
                    itemOrdered + " (" + quantityOrdered + ")");
            return true;
        } finally {
            inventoryLock.unlock();
        }
    }

    private void checkInventoryLevels() {
        try {
            inventoryLock.lock();
            System.out.println("------------------------------------");
            AbstractMap<Object, Object> inventoryMap = null;
            inventoryMap.entrySet().stream().forEach((inventoryEntry) -> {
                System.out.println("Inventory Level :" + inventoryEntry.getKey() + " " +
                        inventoryEntry.getValue());
            });
            System.out.println("------------------------------------");
        } finally {
            inventoryLock.unlock();
        }
    }
}
