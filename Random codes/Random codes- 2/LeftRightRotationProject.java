/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftrightrotationproject;
import java.util.Scanner;
/**
 *
 * @author ashiq
 */
public class LeftRightRotationProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Originial Array is: ");
        {
            for (int x:A)//Orginial Array
            {
                System.out.print(x+",");
                
            }
        }
        System.out.println("");
        System.out.println("Choose an option");
        System.out.println("1. Left Rotaion");
        System.out.println("2. Right Rotation");
        System.out.println("Press 1 or 2");
        
        int n=sc.nextInt();
        int i;
        
        if(n==1)//Left Rotation
        {
            int temp=A[0];
            for( i=0;i<A.length-1;i++)
            {
                A[i]=A[i+1];
            }
            A[i]=temp;
            
            System.out.println("Left Rotation is");
        
            for (int x:A)//Orginial Array
            {
                System.out.print(x+",");
            }
        }
        
        
         if(n==2)//Right Rotation
        {
            int temp=A[A.length-1];
            for( i=A.length-1;i>=1;i--)
            {
                A[i]=A[i-1];
            }
            A[i]=temp;
            
            System.out.println("Right Rotation is");
        
            for (int x:A)//Orginial Array
            {
                System.out.print(x+",");
            }
        }
        
        
        // TODO code application logic here
    }
    
}
