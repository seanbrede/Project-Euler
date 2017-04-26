package projecteuler;

/**
 * Finds the sum of all even Fibonacci numbers below 4,000,000.
 * @author Sean
 */

public class Euler002 {
    
    public static void main(String[] args) {
        
        long sum = 0;
        int second = 1;
        int fib = 2;
        
        while(fib <= 4000000) {
            
            if(fib % 2 == 0) sum += fib;
            
            fib += second;
            second = fib - second;
        }
        
        System.out.println("The sum of all even Fibonacci numbers below "
                + "4,000,000 is: " + sum);
    }
}
