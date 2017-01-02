package chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: StreamExample
 * Date: 2017-01-03
 * Time: 오전 8:43
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StreamExample {
    static List<Stock> myStocks = new ArrayList();

    private static void createStocks() {
        myStocks.add(new Stock("ORCL", "Oracle", 500.0));
        myStocks.add(new Stock("AAPL", "Apple", 200.0));
        myStocks.add(new Stock("GOOG", "Google", 100.0));
        myStocks.add(new Stock("IBM", "IBM", 50.0));
        myStocks.add(new Stock("MCD", "McDonalds", 300.0));
    }

    public static void main(String[] args) {
        createStocks();
        myStocks.stream()
                .forEach(s -> System.out.println(s.getName()));
        boolean allGt = myStocks.stream()
                .allMatch(s -> s.getShares() > 100.0);
        System.out.println("All Stocks Greater than 100.0 Shares? " + allGt);
    }
}
