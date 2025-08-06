package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availavleIDs = TimeZone.getAvailableIDs();
        for(String availavleID : availavleIDs) {
            System.out.println(availavleID);
        }
    }
}
