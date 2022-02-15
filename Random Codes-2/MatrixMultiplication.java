/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author ashiq
 */
public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int A[][]={{1,2,3},{2,3,4},{5,6,7}};//123  1,2,3
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        
        int C[] []=new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
            
            {
                C[i][j]=C[i][j]+A[i][k]*B[k][j];
            }
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
    }
    
}
