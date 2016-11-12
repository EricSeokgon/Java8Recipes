package chapter4.recipe_04_05;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by hadeslee on 2016-11-13.
 */
public class recipe04_05 {
    public static void main(String[] args) {
        BigDecimal currencyOne = new BigDecimal("25.65");
        BigDecimal currencyTwo = new BigDecimal("187.32");
        BigDecimal currencyThree = new BigDecimal("4.86");

        BigDecimal result = null;
        String printFormat = null;

        // Add all three values
        result = currencyOne.add(currencyTwo).add(currencyThree);

        // Convert to double and send to formatDollars(), returning a String
        printFormat = formatDollars(result.doubleValue());
        System.out.println(printFormat);

        // Subtract the first currency value form the second
        result = currencyTwo.subtract(currencyOne);
        printFormat = formatDollars(result.doubleValue());
        System.out.println(printFormat);
    }

    private static String formatDollars(double value) {
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return dollarFormat.format(value);
    }
}
