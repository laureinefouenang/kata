package stringcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static stringcalculator.ProceduralStringCalculator.add;


public class ProceduralStringCalculatorTest {
    @Test
    public void should_return_0_for_empty_string() {
        assertEquals(0, add(""), 0);
    }

    @Test
    public void should_return_the_enter_number_for_that_enter_number() {
        assertEquals(7, add("7"), 0);
    }

    @Test
    public void should_return_the_sum_of_the_entries_values() {
        assertEquals(4 + 2, add("4,2"), 0);
    }

    @Test
    public void should_return_the_sum_of_multiple_entries_values() {
        assertEquals(5 + 2 + 1 + 20 + 25, add("5,2,1,20,25"), 0);
    }

    @Test
    public void should_return_the_sum_of_multiple_entries_with_space() {
        assertEquals(8 + 3 + 17 + 1, add("8,3\n17,1"), 0);
    }

    @Test
    public void should_return_the_sum_of_multiple_entries_values_with_multiple_delimiter(){
        assertEquals(8+4+3, add("//;\n8;4;3"), 0);
    }
}
