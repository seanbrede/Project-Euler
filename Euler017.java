package projecteuler;

/*
 * 
 * @author Sean
 */

public class Euler017 {
    
    public static void main(String[] args) {
        
        int sum = 0;       
        for(int n = 1; n <= 1000; n++)
            sum += findLetterSum(n);
        
        System.out.println("The sum of letters in the words for the numbers 1"
            + " through 1000 is: " + sum);
    }
    
    private static int findLetterSum(int number) {
        
        final String[] names19 = {"","one","two","three","four","five","six",
                "seven","eight","nine","ten","eleven","twelve","thirteen",
                "fourteen","fifteen","sixteen","seventeen","eighteen",
                "nineteen"};
        
        final String[] names99 = {"","","twenty","thirty","forty","fifty",
                "sixty","seventy","eighty","ninety"};
        
        // if number is between 1 and 19 inclusive
        if(number < 20) return names19[number].length();
        
        // if number is between 20 and 99 inclusive
        else if(number < 100)
            return names99[number / 10].length() + findLetterSum(number % 10);
        
        // if number is between 100 and 999 inclusive
        else if(number < 1000) {
            int sum = findLetterSum(number / 100) + "hundred".length();          
            if(number % 100 > 0) sum += "and".length();
            
            return sum + findLetterSum(number % 100);            
        }
        
        // if number is 1000 
        return "onethousand".length();
    }
}
