package fibonacci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestFibonacci {

    @Test
    public void test_should_compute_fibonacci_value_with_iterative_implementation() {
        compute_fibonacci_values(Fibonacci::computeIterative);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_should_throw_exception_when_input_is_negative_with_iterative_implementation() {
        Fibonacci.computeIterative(-3);
    }

    @Test
    public void test_should_compute_fibonacci_value_with_recursive_implementation() {
        compute_fibonacci_values(Fibonacci::computeRecursive);
        compute_fibonacci_values(Fibonacci::memoizedComputeRecursive);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_should_throw_exception_when_input_is_negativewith_recursive_implementation() {
        Fibonacci.computeRecursive(-3);
    }

    @Test
    public void test_should_compute_fibonacci_value_with_quick_recursive_implementation() {
        compute_fibonacci_values(Fibonacci::computeQuickRecursive);
    }

    public void compute_fibonacci_values(final FibonacciComputer fibonacci) {
        assertEquals(0, fibonacci.compute(0));
        assertEquals(1, fibonacci.compute(1));
        assertEquals(1, fibonacci.compute(2));
        assertEquals(2, fibonacci.compute(3));
        assertEquals(3, fibonacci.compute(4));
        assertEquals(5, fibonacci.compute(5));
        assertEquals(8, fibonacci.compute(6));
        assertEquals(6765, fibonacci.compute(20));
    }

    public interface FibonacciComputer {
        int compute(int input);
    }

}
