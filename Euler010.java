package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler010 {
    
    public static void main(String[] args) {
     
        long sum = 2;
        
        for(int n = 3; n < 2000000; n += 2) {     
            if(checkPrime(n)) continue;          
            sum += n;
        }
        
        System.out.println("Sum is: " + sum);
    }
    
    public static boolean checkPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        
        return true;
    }
}
