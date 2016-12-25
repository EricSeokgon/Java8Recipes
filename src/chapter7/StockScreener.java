package chapter7;

import java.util.Iterator;
import java.util.List;

/**
 * Created by hadeslee on 2016-12-26.
 */
public class StockScreener {
    enum Screen {PE, YIELD, BETA}

    ;

    public static boolean screen(String stock, Screen screen, double threshold) {
        double screenVal = 0;
        boolean pass = false;
        switch (screen) {
            case PE:
                screenVal = Math.random() * 25;
                pass = screenVal <= threshold;
                break;
            case YIELD:
                screenVal = Math.random() * 10;
                pass = screenVal >= threshold;
                break;
            case BETA:
                screenVal = Math.random() * 2;
                pass = screenVal <= threshold;
                break;
        }
        System.out.println(stock + ": " + screen.toString() + " = " + screenVal);
        return pass;
    }

    public static void screen(List<String> stocks, Screen screen, double threshold) {
        Iterator<String> iter = stocks.iterator();
        while (iter.hasNext()) {
            String stock = iter.next();
            if (!screen(stock, screen, threshold)) {
                iter.remove();
            }
        }
    }

}
