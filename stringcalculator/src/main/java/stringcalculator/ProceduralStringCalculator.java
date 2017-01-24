package stringcalculator;

public class ProceduralStringCalculator {
    public static double add(String input) {
        double result = 0;
        for (String token : tokenize(input)) {
            result += parseToDouble(token);
        }
        return result;
    }

    private static double parseToDouble(String token) {
        if (!token.trim().isEmpty()) {
            return Integer.parseInt(token.trim());
        }
        return 0;
    }

    private static String[] tokenize(String number) {
        return number.split(",|\n");
    }
}
