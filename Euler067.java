package projecteuler;

/**
 * Reads a pyramid of numbers from a text file and outputs the value of the
 * largest path.
 * @author Sean Brede
 */

import java.util.List;

public class Euler067 {
    
    public static void main(String[] args) {
        
        List<String> pyramidList =
            EulerHelpers.buildListFromFile("Euler067.txt");
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
        
        System.out.println("The value of the largest path is: " + max);
    }
}
