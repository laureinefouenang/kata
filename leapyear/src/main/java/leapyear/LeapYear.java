package leapyear;

import java.util.GregorianCalendar;

public class LeapYear {

    private final static int gregorianCutoverYear = 1582;

    public static boolean leapYear(int year) {
        if (isTypicalLeapYear(year)) {
            if (year >= gregorianCutoverYear) {
                if (isAtypicalCommon(year)) {
                    if (isAtypicalLeapYear(year)) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isTypicalLeapYear(int year) {
        return year % 4 == 0;
    }

    private static boolean isAtypicalCommon(int year) {
        return year % 100 == 0;
    }

    private static boolean isAtypicalLeapYear(int year) {
        return year % 400 == 0;
    }

    public static void main(String[] args) {
        for (int year = 0; year < 2000; year++) {
            System.out.println("assertEquals(" + new GregorianCalendar().isLeapYear(year) + ", LeapYear.leapYear(" + year + "));");
        }
    }
}
