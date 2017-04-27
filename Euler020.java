package projecteuler;

/*
 *
 * @author Sean
 */

import java.math.BigInteger;

public class Euler020 {
    
    public static void main(String[] args) {
        
        // calculate value of factorial
        BigInteger factorial = BigInteger.valueOf(100);      
        for(int i = 2; i < 100; i++) 
            factorial = factorial.multiply(BigInteger.valueOf(i));
        
        String check = factorial.toString();
        
        // calculate sum of digits
        int sum = 0;       
        for(int i = 0; i < check.length(); i++)
            sum += Character.getNumericValue(check.charAt(i));
        
        System.out.println(sum);
    }
}
