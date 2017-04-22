package projecteuler;

/**
 *
 * @author Sean
 */

public class Euler014 {
    
    public static void main(String[] args) {
    
        long biggest = 0;
        int biggestcounter = 0;
        
        for(int i = 999999; i > 700000; i--) {
            int counter = 0;
            long number = i;
            
            System.out.print(number);
            
            while(number != 1) {
                if(number % 2 == 0) number = number / 2;
                else number = (number * 3) + 1;
                
                counter++;
            }
            
            if(counter > biggestcounter) {
                biggest = i;
                biggestcounter = counter;
            }
            
            System.out.println(" : " + counter);
        }
        
        System.out.println("Biggest number is: " + biggest);
    }  
}
