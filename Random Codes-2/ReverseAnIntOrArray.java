/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseanintorarray;

import java.util.Scanner;
public class ReverseAnIntOrArray {

     int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        return rev;
                
    }
    static int[] reverse(int A[])
    {
        int B[]=new int [A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose your option: ");
        System.out.print("1.Integer reverse ");
        System.out.print("2.Array Reverse ");
        System.out.println("");
        int x=sc.nextInt();
        
        if(x==1)
        {
            System.out.println("Enter an integer number ");
            int n=sc.nextInt();
            ReverseAnIntOrArray t= new ReverseAnIntOrArray();
            System.out.println("Reverse of the integer: "+t.reverse(n));
        }
        else
        {
            int A[]={1,2,3,4,5};
            //int B[]=new int [A.length];
           
            System.out.println("Reverse of the array: "+reverse(A));
        }
    }
    
}
