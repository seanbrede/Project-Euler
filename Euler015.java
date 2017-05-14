package projecteuler;

/*
 * Finds the number of routes through an x by y grid from one corner to the
 * opposite corner.
 * @author Sean
 */

import java.math.BigInteger;

public class Euler015 {
    
    public static void main(String[] args) {
        
        // the number of paths can be represented by (x + y)choose(x)
        int x = 20;
        int y = 20;
        
        System.out.println("The number of paths through a 20 by 20 grid is: " + 
                choose(x + y, x)); //choose(x + y, x));       
    }
    
    private static BigInteger choose(int n, int k) {
                
        // (n)choose(k) = n! / (k! * (n - k)!)       
        BigInteger answer = getBigFactorial(n - k);
        answer = answer.multiply(getBigFactorial(k));
        answer = getBigFactorial(n).divide(answer);
        
        return answer;
    }
    
    private static BigInteger getBigFactorial(int number) {
        
        BigInteger answer = BigInteger.valueOf(1);
        for(int i = number; i > 1; i--)
            answer = answer.multiply(BigInteger.valueOf(i));
        
        return answer;
    }
}