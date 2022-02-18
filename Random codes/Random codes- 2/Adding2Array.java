/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adding2array;

/**
 *
 * @author ashiq
 */
public class Adding2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][]={{1,2,3},{2,3,4},{5,6,7}};
        int B[][]={{1,2,3},{2,3,4},{5,6,7}};
        
        int C[] []=new int[3][3];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println("");
        }
        
        // TODO code application logic here
    }
    
}
