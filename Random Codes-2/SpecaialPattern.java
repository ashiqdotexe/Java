/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specaial.pattern;

/**
 *
 * @author ashiq
 */
public class SpecaialPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)//upper triangle
        {
            for(int j=0;j<=5;j++)
            {
                if(i+j>=5) //left side
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int k=0;k<=5;k++)
            {
                if(k<i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
         for(int i=0;i<=5;i++)//under triangle start
        {
            for(int j=0;j<=5;j++)
            {
                if(j>=i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int k=0;k<=5;k++)
            {
                
                if(i+k<=5-1)//right side   if(i+j>=5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        
        
        }
        
        // TODO code application logic here
    }
}
    

