/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1d.array.demo;

/**
 *
 * @author ashiq
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]= new int[5];
        int B[]={1,2,3,4,5};
        System.out.println("Lenght of array A is: "+A.length);
        System.out.println("Lenght of array B is: "+B.length);
        B[2]=15;
        
        System.out.println("Elements of B are: ");
        
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        System.out.println("Incresed Elements of B are: ");
        for(int y:B)
        {
            System.out.println(y);
        }
        System.out.println("Elements of A are:");
        for(int x:A)
        {
            System.out.println(A[x]);
        }
        // TODO code application logic here
    }
    
}
