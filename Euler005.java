package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler005 {
    
    public static void main(String[] args) {
        
        int lcm = 2;
        int sum = 2;
        
        for(int number = 3; number <= 20; number++) {
            
            while(sum % number != 0) sum += lcm;         
            
            lcm = sum;
        }

    System.out.println( "Lowest multiple is: " + lcm);
    }
}