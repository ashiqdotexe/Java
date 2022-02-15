/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingmaxvalue;

/**
 *
 * @author ashiq
 */
public class FindingMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int A []={5,2,3,4,5,6,7,8,10};
       int max=A[0];
        
        for(int i=0;i<A.length;i++)
        {
             if(max<A[i]){
               max=A[i];
             }
            
        }
        System.out.println(max);
        // TODO code application logic here
    }
    
}
