package stringcalculator;

public class StringCalculator {
    public static double add (String number){
        String[] ArrayOfNumbers = number.split(",");
        if(ArrayOfNumbers.length > 2){
            throw new RuntimeException("You have enter more than two numbers!");
        }
        else{
            for(String anumber : ArrayOfNumbers){
                if(! anumber.isEmpty()){
                    Integer.parseInt(anumber);
                }
            }
        }
        return 0;
    }
}
