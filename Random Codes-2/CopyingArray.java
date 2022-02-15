/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingarray;

/**
 *
 * @author ashiq
 */
public class CopyingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array A: ");
        for(int y:A)
        {
            System.out.print(y+",");
        }
        System.out.println("");
        int B[]=new int[10];
        System.out.println("Array B: ");
        for(int x:B)
        {
            System.out.print(x+",");
        }
        System.out.println("");
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        System.out.println("Copying Array A to Array B : ");
        for(int x:B)
        {
            System.out.print(x+",");
        }
    }
    
}
