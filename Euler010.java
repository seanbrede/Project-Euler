/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Sean
 */
public class Euler10 {
    
    public static void main(String[] args) {
        
        long sum = 2;
        
        primeloop:
        for(int i = 3; i < 2000000; i += 2) {
            
            for(int check = 2; check <= Math.sqrt(i); check++) {
                if(i % check == 0) continue primeloop;
            }
            
            sum += i;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
