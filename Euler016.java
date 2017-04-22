package projecteuler;

/**
 *
 * @author Sean
 */

import java.math.BigInteger;

public class Euler016 {
    
    public static void main(String[] args) {
    
        BigInteger number = BigInteger.valueOf(2);
        number = number.pow(1000);
        
        int sum = 0;
        String convert = number.toString();
        
        for(int i = 0; i < convert.length(); i++) {
            
            sum += Character.getNumericValue(convert.charAt(i));
        }
        
        System.out.println(sum);
    }
}
