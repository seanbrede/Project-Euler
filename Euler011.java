package projecteuler;

/*
 *
 * @author Sean
 */

import javax.swing.JOptionPane;
import java.util.List;

public class Euler011 {
    
    public static void main(String[] args) {
        
        String filename = JOptionPane.showInputDialog("Input the full path " +
                "to a text file containing a grid of numbers:");
        
        List<String> gridList = EulerHelpers.buildListFromFile(filename);        
        int[][] gridArray = EulerHelpers.build2dArrayFromList(gridList);
        
        int max = 0, possibleMax;
        
        for(int y = 0; y < gridArray.length; y++) {
            for(int x = 0; x < gridArray[y].length; x++) {
                
                // check horizontal
                if(x > 2) {
                    possibleMax = gridArray[y][x] * gridArray[y][x - 1] *
                        gridArray[y][x - 2] * gridArray[y][x - 3];
                    if (possibleMax > max) max = possibleMax;
                }
                
                // check vertical
                if(y > 2) { 
                    possibleMax = gridArray[y][x] * gridArray[y-1][x] *
                        gridArray[y-2][x] * gridArray[y-3][x];
                    if(possibleMax > max) max = possibleMax;
                }
                
                // check up diagonal
                if(y > 2 && x > 2) {
                    possibleMax = gridArray[y][x] * gridArray[y-1][x-1] *
                        gridArray[y-2][x-2] * gridArray[y-3][x-3];
                    if(possibleMax > max) max = possibleMax;
                    
                }
                
                // check down diagonal
                if(y < gridArray.length - 3 && x > 2) {
                    possibleMax = gridArray[y][x] * gridArray[y+1][x-1] * 
                        gridArray[y+2][x-2] * gridArray[y+3][x-3];
                    if(possibleMax > max) max = possibleMax;
                }
            }         
        }
        
        System.out.println("The largest product of four adjacent cells " +
            "in that grid is: " + max);
    }
}
