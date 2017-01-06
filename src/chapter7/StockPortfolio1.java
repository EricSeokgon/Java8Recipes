package chapter7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Project: Java8Recipes
 * FileName: StockPortfolio1
 * Date: 2017-01-06
 * Time: 오전 10:58
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StockPortfolio1 {
    Map<String, Stock> portfolio = new HashMap<>();

    public void summary() {
        System.out.println("==Legacy technique for traversing Map.Entry==");
        for (Map.Entry<String, Stock> entry : portfolio.entrySet()) {
            System.out.println("Stock = " + entry.getKey() + ",Shares = "
                    + entry.getValue().getShares());
        }
        System.out.println("==Utilization of new foreach and lamdba combination==");
        portfolio.forEach((k, v) -> System.out.println("Stock = " + k + ", Shares" + v.getShares()));
    }

    public List<Stock> alertListLegacy() {
        System.out.println("==Legacy technique for filtering and collecting ==");
        List<Stock> alertList = new ArrayList<>();
        for (Stock stock : portfolio.values()) {
            if (!StockScreener.screen(stock.getSymbol(), StockScreener.Screen.PE, 20)) {
                alertList.add(stock);
            }
        }
        return alertList;
    }
    public List<Stock> alertList() {
        return
                portfolio.values().stream()
                        .filter(s -> !StockScreener.screen(s.getSymbol(), StockScreener.Screen.PE, 20))
                .collect(Collectors.toList());
    }
}
