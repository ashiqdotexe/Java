/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandlinechallenge;

/**
 *
 * @author ashiq
 */
public class CommandLineChallenge {


    
    public static void main(String[] args) {
        double s=0;
        for(String x:args)
        {
            if(x.matches("[0-9\\.]"))
            s=s+Double.parseDouble(x);
            
        }
        System.out.println("Sum is "+s);
    }
    
}
