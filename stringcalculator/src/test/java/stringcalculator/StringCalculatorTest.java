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


}
