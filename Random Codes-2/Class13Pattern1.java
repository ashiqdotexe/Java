/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.pkg13.pattern.pkg1;

/**
 *
 * @author ashiq
 */
public class Class13Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                if(j+i>5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
