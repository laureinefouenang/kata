import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int computeIterative(int input) {
        if (input < 0) {
            throw new IllegalArgumentException();
        }
        int fibonacci = 0;
        int previous = 1;
        int lastPrevious;
        while (input > 0) {
            lastPrevious = previous;
            previous = fibonacci;
            fibonacci = previous + lastPrevious;
            input--;
        }
        return fibonacci;
    }

    public static int computeRecursive(int input) {
        if (input < 0) throw new IllegalArgumentException();
        if (input <= 1) return input;
        return computeRecursive(input - 1) + computeRecursive(input - 2);
    }

    private static final Map<Integer, Integer> cache = new HashMap<>();
    public static int memoizedComputeRecursive(int input) {
        if (input < 0) throw new IllegalArgumentException();
        if (cache.containsKey(input)) return cache.get(input);
        if (input <= 1) return input;
        int result = memoizedComputeRecursive(input - 1) + memoizedComputeRecursive(input - 2);
        cache.put(input, result);
        return result;
    }

    public static int computeQuickRecursive(int input) {
        if (input < 0) throw new IllegalArgumentException();
        if (input == 0) return 0;
        return internalComputeQuickRecursive(input)[0];
    }

    private static int[] internalComputeQuickRecursive(int input) {
        if (input == 1) return new int[] {1, 0};
        int[] previous = internalComputeQuickRecursive(input - 1);
        return new int[]{previous[0] + previous[1], previous[0]};
    }

    public static void main(String[] args) {
        final int N = 100;
        long start = System.nanoTime();
            //computeIterative(N);
            //computeQuickRecursive(N);
            //computeRecursive(N);
            memoizedComputeRecursive(N);
        long stop = System.nanoTime();
        double delay = (double)(stop - start) / 1000000.0;
        System.out.println("Time: " + delay);
    }
}
