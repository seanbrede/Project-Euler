package projecteuler;

/*
 * Finds the sum of all multiple of 3 or 5 below 1000.
 * @author Sean
 */

public class Euler001 {
    
    public static void main(String[] args) {
        
        // iterate up to 1000 and add number if it divides by 3 or 5
        int sum = 0;
        for(int i = 0; i < 1000; i++)
            if(i % 3 == 0 || i % 5 == 0 ) sum += i;
        
        System.out.println("The sum of all multiples of 3 or 5 below " + 
            "1000 is: " + sum);
    }
}
