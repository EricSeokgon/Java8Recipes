package chapter4.recipe_04_12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by hadeslee on 2016-11-19.
 */
public class recipe04_12 {
    public static void instants() {
        Instant timestamp = Instant.now();
        System.out.println("The current timestamp : " + timestamp);

        //Now minus three days
        Instant minusThree = timestamp.minus(3, ChronoUnit.DAYS);
        System.out.println("Now minus three days : " + minusThree);

        ZonedDateTime atZone = timestamp.atZone(ZoneId.of("GMT"));
        System.out.println(atZone);

        Instant yesterday = Instant.now().minus(24, ChronoUnit.HOURS);
        System.out.println("Yesrerday : " + yesterday);

    }

    public static void main(String[] args) {
        instants();
    }
}
