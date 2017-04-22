package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler007 {
    
    public static void main(String[] args) {
        
        int prime = 1;
        int count = 1;
        
        countloop:
        while (count < 10002) {
            
            prime++;
            
            for(int check = 2; check <= Math.sqrt(prime); check++) {
                if(prime % check == 0) continue countloop;
            }
            
            count++;     
        }
        
        System.out.println("10001st prime is: " + prime);
    }
}