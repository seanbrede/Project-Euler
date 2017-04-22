/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

/**
 * @author Sean Brede
 * Reads in a pyramid of numbers from a text file and outputs the value of the
 * largest path.
 */
public class Euler067 {
    
    public static void main(String[] args) {
        
        // Probably better to allow user to input a file but it works for now
        Path pyramidPath = Paths.get(
            "C:\\Users\\Sean\\Documents\\NetBeansProjects\\Euler\\src\\euler", 
            "pyramid67.txt");
        
        List<String> thePyramid = null; // unsure what to do about this warning
                                        // but program still works as intended              
        try {
            thePyramid = Files.readAllLines(pyramidPath);
        } catch(IOException e) {
            System.out.println (e.toString()); // print exception if occurs
            System.exit(-1);
        }
        
        /*
        //testing
        for (String line : thePyramid) {
            System.out.println(line);
        }
        */
        
        int[][] pyramidArray = new int[thePyramid.size()][];

        for (int i = 0; i < thePyramid.size(); i++) {
            String[] splitLine = thePyramid.get(i).split("\\s");

            pyramidArray[i] = new int[splitLine.length];
            
            for (int j = 0; j < splitLine.length; j++) {
                pyramidArray[i][j] = Integer.parseInt(splitLine[j]);
            }
        }
        
        /*
        //testing
        for (int[] row : pyramidArray) {
            for (int col : row) {
                System.out.printf("%3d", col);
            }
        
            System.out.println();
        }
        */
        
        int max = pyramidArray[0][0];
        
        for (int y = 0; y < pyramidArray.length; y++) {           
            for(int x = 0; x < pyramidArray[y].length; x++) {
                
                if(y == 0 && x == 0) continue;
                
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
                
                //testing
                //System.out.println(pyramidArray[y][x]);
            }
        }
        
        System.out.println("The value of the largest path is: " + max);
    }
}
