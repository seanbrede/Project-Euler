package projecteuler;

/*
 * Reads a pyramid of numbers from a text file and outputs the value of the
 * largest path through.
 * @author Sean Brede
 */

import javax.swing.JOptionPane;
import java.util.List;

public class Euler018 {
    
    public static void main(String[] args) {      
        String filename = JOptionPane.showInputDialog("Input the full path " +
                "to a text file containing a pyramid of numbers:");
        
        List<String> pyramidList = EulerHelpers.buildListFromFile(filename);        
        int[][] pyramidArray = EulerHelpers.build2dArrayFromList(pyramidList);
        
        int max = pyramidArray[0][0]; // initial max is top number
        
        // iterate, starting from second row, through each number in the array
        // from left to right, top to bottom, adding the bigger of the two
        // above it
        for (int y = 1; y < pyramidArray.length; y++) {           
            for(int x = 0; x < pyramidArray[y].length; x++) {
                
                if(x != 0 && x != pyramidArray[y].length - 1)
                {
                    if(pyramidArray[y-1][x] > pyramidArray[y-1][x-1])
                        pyramidArray[y][x] += pyramidArray[y-1][x];
                    else
                        pyramidArray[y][x] += pyramidArray[y-1][x-1];
                }
                
                else if(x == 0) pyramidArray[y][x] += pyramidArray[y-1][x];               
                else if(x == pyramidArray[y].length - 1)
                    pyramidArray[y][x] += pyramidArray[y-1][x-1];
                
                if(pyramidArray[y][x] > max) max = pyramidArray[y][x];
            }
        }
        
        System.out.println("The value of the largest path through is: " + max);
    }
}
