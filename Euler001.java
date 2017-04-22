/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

public class Euler001 {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i=0; i<1000; i++) {
            if(i%3==0 || i%5==0) sum+=i;
        }
        
        System.out.println( "The number is: " + sum );
    }
}
