package stringcalculator;

public class ProceduralStringCalculator {

    public static double add(String input) {
        double result = 0;
        String delimiter = ",|\n";
        if(input.startsWith("//")){
            delimiter = String.valueOf(input.charAt(2));
            input = input.substring(3);
        }

        for (String token : input.split(delimiter)) {
            if (!token.trim().isEmpty()) {
                result += Integer.parseInt(token.trim());
            }
        }
        return result;
    }
}
