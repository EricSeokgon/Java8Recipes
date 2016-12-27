package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Project: Java8Recipes
 * FileName: StockPortfolio
 * Date: 2016-12-27
 * Time: 오전 8:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StockPortfolio implements Iterable<Stock> {
    Map<String, Stock> portdolio = new HashMap<>();

    public void add(Stock stock) {
        portdolio.put(stock.getSymbol(), stock);
    }

    public void add(List<Stock> stocks) {
        for (Stock s : stocks) {
            portdolio.put(s.getSymbol(), s);
        }
    }

    @Override
    public Iterator<Stock> iterator() {
        return portdolio.values().iterator();
    }

    public static void main(String[] args) {
        StockPortfolio myPortfolio = new StockPortfolio();
        myPortfolio.add(new Stock("ORCL", "Oracle", 500.0));
        myPortfolio.add(new Stock("AAPL", "Apple", 200.0));
        myPortfolio.add(new Stock("GOOG", "Google", 100.0));
        myPortfolio.add(new Stock("IBM", "IBM", 50.0));
        myPortfolio.add(new Stock("MCD", "McDonalds", 300.0));
        System.out.println("======Print using legacy for-each loop=====");
        myPortfolio.forEach(s -> System.out.println(s));
    }
}
