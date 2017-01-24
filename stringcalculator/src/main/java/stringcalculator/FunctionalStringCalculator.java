package stringcalculator;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalStringCalculator {
    public static double add(String input) {
        return tokenize(input)
                .map(String::trim)
                .filter(isNotEmpty())
                .mapToDouble(Double::parseDouble)
                .sum();
    }

    private static Predicate<String> isNotEmpty() {
        return token -> !token.isEmpty();
    }

    private static Stream<String> tokenize(String number) {
        return Arrays.stream(number.split(",|\n"));
    }
}
