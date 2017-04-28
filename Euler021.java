package projecteuler;

/*
 *
 * @author Sean
 */

public class Euler021 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for(int i = 1; i < 10000; i++)           
            if(sumFactors(i) != i && sumFactors(sumFactors(i)) == i) sum += i;
        
        System.out.println("The sum of all amicable numbers below 10,000 is: "
            + sum);
    }
    
    private static int sumFactors(int number) {
        
        int sum = 0;      
        for(int i = 1; i <= number / 2 + 1; i++)
            if(number % i == 0) sum += i;
        
        return sum;
    }
}
