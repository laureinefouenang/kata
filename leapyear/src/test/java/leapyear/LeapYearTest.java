package leapyear;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void should_return_false_if_year_is_typical_common_year(){
        assertEquals(false, LeapYear.leapYear(2001));
        assertEquals(false, LeapYear.leapYear(1997));
        assertEquals(false, LeapYear.leapYear(2013));
        assertEquals(false, LeapYear.leapYear(1513));
    }

    @Test
    public void should_return_true_if_year_is_typical_leap_year(){
        assertEquals(true, LeapYear.leapYear(1996));
        assertEquals(true, LeapYear.leapYear(1992));
    }

    @Test
    public void should_return_false_if_year_is_atypical_common_year(){
        assertEquals(false, LeapYear.leapYear(1900));
    }

    @Test
    public void should_return_true_if_year_is_atypical_leap_year(){
        assertEquals(true, LeapYear.leapYear(2000));
    }
}