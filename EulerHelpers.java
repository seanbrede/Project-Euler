package projecteuler;

/**
 * 
 * @author Sean
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EulerHelpers {
    
    public static int[][] build2dArrayFromList(List<String> list) {
        
        // create array, split each line into single numbers, and add those
        // numbers to the array
        int[][] array = new int[list.size()][];
        
        for (int i = 0; i < list.size(); i++) {
            String[] splitLine = list.get(i).split("\\s");
            array[i] = new int[splitLine.length];          
            for (int j = 0; j < splitLine.length; j++)
                array[i][j] = Integer.parseInt(splitLine[j]);
        }
        
        return array;
    }
    
    /*
    public static int[] buildArrayFromTextFile(String filename) {
        List<String> numbers = null;
        
        // attempt to read file, catching exception and terminating program if
        // unsuccessful
        try {
            numbers = Files.readAllLines(Paths.get(filename));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        
        // create array and add numbers to it
        int[] array = new int[numbers.size()];       
        for (int i = 0; i < numbers.size(); i++)
            array[i] = Integer.parseInt(numbers.get(i));
        
        return array;   
    }
    */
    
    public static List<String> buildListFromFile(String filename) {
        List<String> numbers = null;
        
        // attempt to read file, catching exception and terminating program if
        // unsuccessful
        try {
            numbers = Files.readAllLines(Paths.get(filename));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        
        return numbers;
    }
}
