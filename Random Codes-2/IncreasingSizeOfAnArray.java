/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increasingsizeofanarray;

/**
 *
 * @author ashiq
 */
public class IncreasingSizeOfAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        System.out.println(A.length);
        int B[]=new int[10];
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
            
        }
        A=B;
        System.out.println(A.length);
        // TODO code application logic here
    }
    
}
