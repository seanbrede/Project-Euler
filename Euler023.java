package projecteuler;

/*
 * Finds the sum of all integers 
 * @author Sean
 */

public class Euler023 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        
        outerloop:
        for(int n = 1; n < 28124; n++) {
            
            for(int i = 1; i < (n / 2) + 1; i++)
                if(isAbundant(i) && isAbundant(n - i)) continue outerloop;
            
            sum += n;
            System.out.println(n);
        }
        
        System.out.println(sum);
    }
    
    public static boolean isAbundant(int number) {
        
        int sum = 0;
        for(int i = 1; i <= number / 2; i++)
            if(number % i == 0) sum += i;
        
        if(sum > number) return true;
        
        return false;
    }
}
