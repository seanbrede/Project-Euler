package projecteuler;

/*
 *
 * @author Sean
 */

import java.util.List;

public class Euler022 {
    
    public static void main(String[] args) {
        
        List<String> list = EulerHelpers.buildListFromFile("C:\\Users\\" +
            "Sean\\Documents\\NetBeansProjects\\Euler\\src\\projecteuler\\" +
            "Euler022.txt");
        
        String names = list.get(0).replace("\",\""," ");
        names = names.replace("\"","");
                
        //System.out.println(derp);
        
        //String[] splitLine = list.get(0).split("\\s");
    }
}
