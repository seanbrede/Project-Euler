package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler009 {
    
    public static void main(String[] args) {
        
        for(int a = 1; a < 1000; a++) {          
            for(int b = a + 1; b < 1000; b++) {
                
                int c = 1000 - b - a;
                
                if(a*a + b*b == c*c) {
                    System.out.println("a: " + a + " b: " + b + " c: " + c);
                    return;
                }
            }
        }
    }
}
