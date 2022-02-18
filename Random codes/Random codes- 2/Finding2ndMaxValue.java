/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding2ndmaxvalue;

/**
 *
 * @author ashiq
 */
public class Finding2ndMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int A []={5,2,3,4,5,6,7,12,10};
          int max2;
       int max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
             if(max1<A[i]){
               max2=max1;
               max1=A[i];
             }
             else if(max2<A[i])
             {
                 max2=A[i];
             }
            
        }
        System.out.println(max2);
        // TODO code application logic here
    }
    
}
