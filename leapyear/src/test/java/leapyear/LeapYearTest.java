package leapyear;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class LeapYearTest {
    @Test
    public void should_return_false_if_year_is_typical_common_year() {
        assertEquals(false, LeapYear.leapYear(2001));
        assertEquals(false, LeapYear.leapYear(1997));
        assertEquals(false, LeapYear.leapYear(2013));
        assertEquals(false, LeapYear.leapYear(1513));
    }

    @Test
    public void should_return_true_if_year_is_typical_leap_year() {
        assertEquals(true, LeapYear.leapYear(1996));
        assertEquals(true, LeapYear.leapYear(1992));
    }

    @Test
    public void should_return_true_if_year_is_typical_leap_year_before_1582() {
        assertEquals(true, LeapYear.leapYear(400));
        assertEquals(true, LeapYear.leapYear(500));
    }

    @Test
    public void should_return_false_if_year_is_atypical_common_year_after_1582() {
        assertEquals(false, LeapYear.leapYear(1900));
    }

    @Test
    public void should_return_true_if_year_is_atypical_leap_year_after_1582() {
        assertEquals(true, LeapYear.leapYear(2000));
    }

    @Test
    public void should_be_correct_regarding_gregorian_calendar() {
        for (int year = 0; year < 2000; year++) {
            assertEquals("Year: " + year, new GregorianCalendar().isLeapYear(year), LeapYear.leapYear(year));
        }
    }
}