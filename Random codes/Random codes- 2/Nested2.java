/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested.pkg2;

/**
 *
 * @author ashiq
 */
public class Nested2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
         for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println(" ");
        }
    }
        // TODO code application logic here
    }
    

