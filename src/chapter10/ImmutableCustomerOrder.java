package chapter10;

/**
 * Project: Java8Recipes
 * FileName: recipe_10_8
 * Date: 2017-01-17
 * Time: 오전 8:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ImmutableCustomerOrder {
    final private String itemOrdered;
    final private int quantityOrdered;
    final private String customerName;

    ImmutableCustomerOrder(String itemOrdered, int quantityOrdered, String customerName) {
        this.itemOrdered = itemOrdered;
        this.quantityOrdered = quantityOrdered;
        this.customerName = customerName;
    }

    public String getItemOrdered() {
        return itemOrdered;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public String getCustomerName() {
        return customerName;
    }

    public synchronized double calculateOrderTotal(double price) {
        return getQuantityOrdered() * price;
    }

}
