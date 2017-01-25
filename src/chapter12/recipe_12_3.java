package chapter12;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Project: Java8Recipes
 * FileName: recipe_12_3
 * Date: 2017-01-26
 * Time: 오전 8:45
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_12_3 {
    private static final Date NOW = new Date();

    public void run() {
// Set ALL locales to fr-FR
        Locale.setDefault(Locale.FRANCE);
        demoDefaultLocaleSettings();
// System default is still fr-FR
// DISPLAY default is es-MX
// FORMAT default is en-US
        Locale.setDefault(Locale.Category.DISPLAY, Locale.forLanguageTag("es-MX"));
        Locale.setDefault(Locale.Category.FORMAT, Locale.US);
        demoDefaultLocaleSettings();
// System default is still fr-FR
// DISPLAY default is en-US
// FORMAT default is es-MX
        Locale.setDefault(Locale.Category.DISPLAY, Locale.US);
        Locale.setDefault(Locale.Category.FORMAT, Locale.forLanguageTag("es-MX"));
        demoDefaultLocaleSettings();
// System default is Locale.US
// Resets both DISPLAY and FORMAT locales to en-US as well.
        Locale.setDefault(Locale.US);
        demoDefaultLocaleSettings();
    }

    private void demoDefaultLocaleSettings() {
        DateFormat df =
                DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        ResourceBundle resource =
                ResourceBundle.getBundle("SimpleResources",
                        Locale.getDefault(Locale.Category.DISPLAY));
        String greeting = resource.getString("GOOD_MORNING");
        String date = df.format(NOW);
        System.out.printf("DEFAULT LOCALE: %s\n", Locale.getDefault());
        System.out.printf("DISPLAY LOCALE: %s\n", Locale.getDefault(Locale.Category.DISPLAY));
        System.out.printf("FORMAT LOCALE: %s\n", Locale.getDefault(Locale.Category.FORMAT));
        System.out.printf("%s, %s\n\n", greeting, date);
    }

    public static void main(String[] args) {
        recipe_12_3 app = new recipe_12_3();
        app.run();
    }
}
