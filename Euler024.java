package projecteuler;

import java.util.Arrays;

/*
 * 
 * @author Sean
 */

public class Euler024 {
    
    public static void main(String[] args) {
        
        int[] digits = new int[10];
        int place = 999999;
        
        for(int i = 0; i < digits.length - 1; i++) {
            digits[i] = place / fact(digits.length - i - 1);
            System.out.print(digits[i] + " : ");
            
            //TODO
            
            for(int j = 0; j < i; j++) if(digits[j] <= digits[i]) digits[i]++;
            
            for(int k = 0; k < i; k++) {
                if(digits[k] == digits[i]) {
                    digits[i]++;
                    k = 0;
                }
            }
            
            System.out.println(digits[i]);
            
            //System.out.println(Arrays.toString(digits));
            
            place = place % fact(digits.length - i - 1);
        }
        
        System.out.println(Arrays.toString(digits));
    }
    
    private static int fact(int number) {
        
        if (number == 1) return 1;
        
        return number * fact(number - 1);
    }
}
