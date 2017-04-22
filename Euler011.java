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
                "to a text file containing a pyramid of numbers:");
        
        List<String> gridList = EulerHelpers.buildListFromFile(filename);        
        int[][] gridArray = EulerHelpers.build2dArrayFromList(gridList);
        
        int max = 0;
        
        for(int i = 0; i < gridArray.length; i++) {
            for(int j = 0; j < gridArray[i].length; j++) {
                if(j >= 3) {
                    int possibleMax = gridArray[i][j] * gridArray[i][j - 1] *
                            gridArray[i][j - 2] * gridArray[i][j - 3];
                    if (possibleMax > max) max = possibleMax;
                }
                
                if(i >= 3) {
                    
                }
                
                if(j >= 3 && i >= 3) {
                    
                }
                
                // TODO
            }
        }
    }
}
