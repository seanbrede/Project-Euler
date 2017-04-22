/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;
import java.math.BigInteger;

/**
 *
 * @author Sean
 */
public class Euler16 {
    
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
