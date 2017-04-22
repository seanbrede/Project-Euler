package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler005 {
    
    public static void main(String[] args) {
        
        int number = 0;
        
        numberloop:
        while(true) {
            number += 20;
            
            for(int factor = 2; factor <= 20; factor++) {
                if(number % factor != 0) {
                    System.out.println(factor);
                    continue numberloop;
                }
            }
            
            break;
        }
        
        System.out.println( "Lowest multiple is: " + number);
    }
}