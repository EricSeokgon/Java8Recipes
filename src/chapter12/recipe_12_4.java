package chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by hadeslee on 2017-01-27.
 */
public class recipe_12_4 {
    public static void main(String[] args) {
        List<Locale.LanguageRange> list1 = Locale.LanguageRange.parse("ja-JP, en-US");
        list1.stream().forEach((range) -> {
            System.out.println("Range:" + range.getRange());
        });
        ArrayList localeList = new ArrayList();
        localeList.add("en-US");
        localeList.add("en-JP");
        List<String> tags1 = Locale.filterTags(list1, localeList);
        System.out.println("The following is the filtered list of locales:");
        tags1.stream().forEach((tag) -> {
            System.out.println(tag);
        });
    }
}
