package chapter4.recipe_04_13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

/**
 * Created by hadeslee on 2016-11-20.
 */
public class recipe04_13 {
    public static void scheduleReport(LocalDateTime checkOut, ZoneId checkOutZone,
                                      LocalDateTime checkIn, ZoneId checkInZone) {

        ZonedDateTime beginTrip = ZonedDateTime.of(checkOut, checkOutZone);
        System.out.println("Trip Begins: " + beginTrip);
        // Get the rules of the check out time zone
        ZoneRules checkOutZoneRules = checkOutZone.getRules();
        System.out.println("Checkout Time Zone Rules: " + checkOutZoneRules);
        //If the trip took 4 days
        ZonedDateTime beginPlus = beginTrip.plusDays(4);
        System.out.println("Four Days Later: " + beginPlus);
        // End of trip in starting time zone
        ZonedDateTime endTripOriginalZone = ZonedDateTime.of(checkIn, checkOutZone);
        ZonedDateTime endTrip = ZonedDateTime.of(checkIn, checkInZone);
        int diff = endTripOriginalZone.compareTo(endTrip);
        String diffStr = (diff >= 0) ? "NO" : "YES";
        System.out.println("End trip date/time in original zone: " + endTripOriginalZone);
        System.out.println("End trip date/time in check-in zone: " + endTrip);
        System.out.println("Original Zone Time is less than new zone time? " +
                diffStr);
        ZoneId checkOutZoneId = beginTrip.getZone();
        ZoneOffset checkOutOffset = beginTrip.getOffset();
        ZoneId checkInZoneId = endTrip.getZone();
        ZoneOffset checkInOffset = endTrip.getOffset();
        System.out.println("Check out zone and offset: " + checkOutZoneId + checkOutOffset);
        System.out.println("Check in zone and offset: " + checkInZoneId + checkInOffset);
    }

}
