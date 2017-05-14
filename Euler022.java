package projecteuler;

/*
 *
 * @author Sean
 */

import java.util.List;
import java.util.Arrays;

public class Euler022 {
    
    public static void main(String[] args) {
        
        List<String> list = EulerHelpers.buildListFromFile("C:\\Users\\" +
            "Sean\\Documents\\NetBeansProjects\\Euler\\src\\projecteuler\\" +
            "Euler022.txt");
        
        String names = list.get(0).replace("\",\""," ");
        names = names.replace("\"","");        
        String[] splitNames = names.split("\\s"); // by this point, names are
                                                  // all alone in an array
        Arrays.sort(splitNames);
        
        int sum = 0;
        for(int i = 0; i < splitNames.length; i++) {
            int lineSum = 0;
            for(int j = 0; j < splitNames[i].length(); j++)
                lineSum += (int)splitNames[i].charAt(j) - 64;
            
            sum += lineSum * (i + 1);
        }
        
        System.out.println(sum);
    }
}
