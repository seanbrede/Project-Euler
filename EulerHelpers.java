package projecteuler;

/**
 * Contains helper functions that assist in processing the data for some
 * problems.
 * @author Sean
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EulerHelpers {
    
    public static int[][] build2dArrayFromList(List<String> list) {
        
        int[][] array = new int[list.size()][];
        // split each line into single numbers and add them to the array
        for (int i = 0; i < list.size(); i++) {
            String[] splitLine = list.get(i).split("\\s");
            
            array[i] = new int[splitLine.length];          
            for (int j = 0; j < splitLine.length; j++)
                array[i][j] = Integer.parseInt(splitLine[j]);
        }
        
        return array;
    }
    
    public static List<String> buildListFromFile(String filename) {
        
        filename = "C:\\Users\\Sean\\Documents\\NetBeansProjects\\Euler\\src\\"
            + "projecteuler\\" + filename;
        
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(filename));
        } catch(Exception e) { // terminate program if cannot find file
            System.err.println(e.toString());
            System.exit(-1);
        }
        
        return list;
    }
}
