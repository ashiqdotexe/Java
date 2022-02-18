/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatingarray;

/**
 *
 * @author ashiq
 */
public class RotatingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A[]={1,2,3,4,5,6,7,8,9,10};
       for(int x:A)
       
           System.out.print(x+",");
           System.out.println(",");
           
        int temp=A[A.length-1];   
       for(int i=A.length-1;i>0;i--)
       {
           A[i]=A[i-1];
       }
       A[0]=temp;
       
       
        for(int x:A)
       
           System.out.print(x+",");
           System.out.println(",");
        // TODO code application logic here
    }
    
    
}
