/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingsumofallelements;

/**
 *
 * @author ashiq
 */
public class FindingSumofAllElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        int A[]={1,2,3,4,5};
        
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum is: "+sum);
        // TODO code application logic here
    }
    
}
