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
public class Euler9 {
    
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
