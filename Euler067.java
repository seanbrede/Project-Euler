package projecteuler;

/**
 * Reads a pyramid of numbers from a text file and outputs the value of the
 * largest path.
 * @author Sean Brede
 */

import javax.swing.JOptionPane;
import java.util.List;

public class Euler067 {
    
    public static void main(String[] args) {      
        String filename = JOptionPane.showInputDialog("Input filename of a " +
                "text file containing a pyramid of numbers.");
        
        List<String> pyramidList = EulerHelpers.buildListFromFile(filename);
        
        // create new array and fill it with numbers from text file
        int[][] pyramidArray = new int[pyramidList.size()][];
        for (int i = 0; i < pyramidList.size(); i++) {
            String[] splitLine = pyramidList.get(i).split("\\s");

            pyramidArray[i] = new int[splitLine.length];
            
            for (int j = 0; j < splitLine.length; j++) {
                pyramidArray[i][j] = Integer.parseInt(splitLine[j]);
            }
        }
        
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
        
        System.out.println("The value of the largest path is: " + max);
    }
}
