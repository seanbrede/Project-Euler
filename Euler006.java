package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler006 {
    
    public static void main(String[] args) {
        
        long numberOne = 0;
        long numberTwo = 0;
        
        for(int i = 1; i <= 100; i++) {
            numberOne += i;
            numberTwo += i * i;
        }
        
        numberOne = numberOne * numberOne;
        
        numberOne = numberOne - numberTwo;
        
        System.out.println("The number is: " + numberOne);
    }
}
