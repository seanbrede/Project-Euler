package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler012 {
    
    public static void main(String[] args) {
        
        long triangle = 0;
        
        for(int i = 1; ; i++) {
            
            triangle += i;
            int divisors = 0;
            
            for(int j = 1; j <= Math.sqrt(triangle); j++) {
                
                if(triangle % j == 0) divisors += 2;
                
                if(divisors > 500) {
                    System.out.println("First number is: " + triangle);
                    return;
                }
            }
            
            System.out.println(divisors);
        }
    }
    
}
