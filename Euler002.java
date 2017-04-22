/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

public class Euler002 {
    
    public static void main(String[] args) {
        long sum = 0;
        int first = 1;
        int fib = 2;
        int hold;
        
        while(fib<=4000000) {
            if(fib%2==0) {
                sum+=fib;
               
            }
            hold = fib;
            fib = first + fib;
            first = hold;
        }
        
        System.out.println( "The number is: " + sum );
    }
}
