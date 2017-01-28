package chapter12;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by hadeslee on 2017-01-29.
 */
public class recipe_12_6 {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal(12345);
        System.out.printf("Default locale: %s\n", Locale.getDefault().getDisplayName());
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String formattedCurrency = nf.format(value);
        System.out.printf("%s\n", formattedCurrency);
        Currency c = Currency.getInstance(Locale.US);
        nf.setCurrency(c);
        formattedCurrency = nf.format(value);
        System.out.printf("%s\n\n", formattedCurrency);
    }
}
