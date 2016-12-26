package chapter7;

/**
 * Project: Java8Recipes
 * FileName: Stock
 * Date: 2016-12-27
 * Time: 오전 8:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Stock {
    private String symbol;
    private String name;
    private Double shares;

    public Stock(String symbol, String name, Double shares) {
        this.symbol = symbol;
        this.name = name;
        this.shares = shares;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Double getShares() {
        return shares;
    }

    @Override
    public String toString() {
        return shares + "shares of " + symbol + " (" + name + ")";
    }
}
