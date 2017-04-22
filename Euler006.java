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
public class Euler6 {
    
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
