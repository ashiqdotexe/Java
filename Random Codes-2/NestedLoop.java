/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested.loop;

/**
 *
 * @author ashiq
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println("");
        }
    }
    
}
