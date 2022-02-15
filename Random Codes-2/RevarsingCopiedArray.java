/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revarsingcopiedarray;

/**
 *
 * @author ashiq
 */
public class RevarsingCopiedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        System.out.println("Copying and revarsing Array A to Array B : ");
        for(int x:B)
        {
            System.out.print(x+",");
        }
    }
    }
    

