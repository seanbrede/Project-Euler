package projecteuler;

/**
 * 
 * @author Sean
 */

import java.util.List;
import javax.swing.JOptionPane;
import java.math.BigInteger;

public class Euler013 {
    
    public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("Input filename of " +
                "text file containing a list of numbers.");
        
        List<String> numbers = EulerHelpers.buildListFromFile(filename);
        
        BigInteger sum = BigInteger.valueOf(0);
        
        for(int i = 0; i < numbers.size(); i++) {
            BigInteger add = new BigInteger(numbers.get(i));
            sum = sum.add(add);
        }
        
        System.out.println("The sum is: " + sum.toString());
    }
}
