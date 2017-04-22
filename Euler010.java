package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler010 {
    
    public static void main(String[] args) {
        
        long sum = 2;
        
        primeloop:
        for(int number = 3; number < 2000000; number += 2) {
            
            for(int rootcheck = 2; rootcheck <= Math.sqrt(number); rootcheck++)              
                if(number % rootcheck == 0) continue primeloop;
            
            sum += number;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
