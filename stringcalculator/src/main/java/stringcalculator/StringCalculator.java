package stringcalculator;

public class StringCalculator {
    public static double add (String number){
        double result = 0;
        String[] ArrayOfNumbers = number.split(",");
            for(String anumber : ArrayOfNumbers){
                if(! anumber.trim().isEmpty()){
                    result += Integer.parseInt(anumber);
                }
            }
        return result;
    }
}
