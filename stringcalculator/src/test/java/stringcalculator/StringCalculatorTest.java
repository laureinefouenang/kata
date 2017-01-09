package stringcalculator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class StringCalculatorTest {
    @Test
    public void should_return_0_for_empty_string(){
        assertEquals(0, StringCalculator.add(""), 0);
    }

    @Test
    public void should_return_the_enter_number_for_that_enter_number(){
        assertEquals(7, StringCalculator.add("7"), 0);
    }

    @Test
    public void should_return_the_sum_of_the_entries_values(){
        assertEquals(4+2, StringCalculator.add("4,2"), 0);
    }

    @Test
    public void should_return_the_sum_of_multiple_entries_values(){
        assertEquals(5+2+1+20+25, StringCalculator.add("5,2,1,20,25"),0);
    }

    @Test
    public void should_return_the_sum_of_multiple_entries_with_space(){
        assertEquals(8+3+17+1, StringCalculator.add("8,3n17,1"),0);
    }


}
