package leapyear;

public class LeapYear {
    public static boolean leapYear(int year) {
        if (isTypicalLeapYear(year)) {
            if (isAtypicalCommon(year)) {
                if (isAtypicalLeapYear(year)) {
                    return true;
                }
                return false;
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
}
