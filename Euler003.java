package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler003 {
    
    public static void main(String[] args) {
        
        long div = 600851475143L;
        int maxfactor = 1;
        
        for(int factor = 2; factor < div; factor++) {
            
            if(div % factor == 0) {
                div = div / factor;
                factor = 2;
                if(factor > maxfactor) maxfactor = factor;
            }    
        }
        
        if(div > maxfactor) maxfactor = (int) div;
        
        System.out.println("Largest prime factor is: " + maxfactor);
    }
}
