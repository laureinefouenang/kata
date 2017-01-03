package leapyear;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void should_return_false_if_year_is_typical_common_year(){
        assertEquals(false, LeapYear.leapYear(2001));
    }
}