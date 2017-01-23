package chapter12;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Locale.Builder;


/**
 * Project: Java8Recipes
 * FileName: recipe_12_2
 * Date: 2017-01-23
 * Time: 오전 9:35
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_12_2 {
    private static final long number = 123456789L;
    private static final Date now = new Date();

    private void createFromBuilder() {
        System.out.printf("Creating from Builder...\n\n");
        String[][] langRegions = {{"fr", "FR"}, {"ja", "JP"}, {"en", "US"}};
        Builder builder = new Builder() {

        };
        Locale l = null;
        NumberFormat nf = null;
        DateFormat df = null;
        for (String[] lr : langRegions) {
            builder.clear();
            builder.setLanguage(lr[0]).setRegion(lr[1]);
            l = builder.build();
            nf = NumberFormat.getInstance(l);
            df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, l);
            System.out.printf("Locale: %s\nNumber: %s\nDate: %s\n\n",
                    l.getDisplayName(),
                    nf.format(number),
                    df.format(now));
        }
    }
}
