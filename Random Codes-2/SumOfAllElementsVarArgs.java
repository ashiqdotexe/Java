/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofallelementsvarargs;


public class SumOfAllElementsVarArgs {

    static int sum(int...A)
    {
        int s=0;
        for(int i=0;i<A.length;i++)
        {
            s=s+A[i];
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,5)); 
    }
    
}
