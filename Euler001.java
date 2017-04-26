package projecteuler;

/**
 * Finds the sum of all multiple of 3 or 5 below 1000 and prints the sum.
 * @author Sean
 */

public class Euler001 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        
        // iterate through numbers, add number if it divides by 3 or 5
        for(int i = 0; i < 1000; i++)
            if(i % 3 == 0 || i%5 == 0 ) sum += i;
        
        System.out.println("The sum of all multiple of 3 or 5 below " + 
            "1000 is: " + sum);
    }
}
