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
public class Euler005r2 {
    
    public static void main(String[] args) {
        
        int lcm = 2;
        int sum = 2;
        
        for(int number = 3; number <= 20; number++) {
            
            while(sum % number != 0) sum += lcm;         
            
            lcm = sum;
        }

    System.out.println( "Lowest multiple is: " + lcm);
    }
}