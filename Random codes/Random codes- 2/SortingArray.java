/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarray;
import java.util.*;
/**
 *
 * @author ashiq
 */
public class SortingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A[]={"java","python","C++","C","ada","django"};
         Arrays.sort(A);
         
         for(String x:A)
         {
             System.out.println(x+" ");
         }
        // TODO code application logic here
    }
    
}
