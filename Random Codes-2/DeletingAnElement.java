/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletinganelement;

import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class DeletingAnElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        A[0]=5;
        A[1]=20;
        A[2]=9;
        A[3]=8;
        A[4]=11;
        System.out.println("Original Elements are: ");
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
        
        
        System.out.println("Please enter in which index you wanna input your value (0-9)");
        int index=sc.nextInt();
        int i;
        
        {
        for( i=0;i>index;i++)
        {
            A[i]=A[i-1];
        }
         A[index]=i--;
            System.out.println("Deleting indext "+index+" Element");
        for(int x:A)
        {
            System.out.print(x+",");
        }
        }
        
        // TODO code application logic here
    }
        // TODO code application logic here
    }
    
