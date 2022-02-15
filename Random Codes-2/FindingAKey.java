/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingakey;
import java.util.*;
/**
 *
 * @author ashiq
 */
public class FindingAKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int A []={1,2,3,4,5,6,7,8,10};
        System.out.println("Enter a value");
        int key=sc.nextInt();
        
        for(int i=0;i<A.length;i++)
        {
             if(key==A[i]){
                System.out.println("The index of the key is "+i);
                System.exit(0);
             }
            
        }
        System.out.println("Invalid");
        
        // TODO code application logic here
    }
    
}
