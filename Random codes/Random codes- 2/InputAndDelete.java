/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputanddelete;
import java.util.Scanner;
/**
 *
 * @author ashiq
 */
public class InputAndDelete {

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
        System.out.println("Choose your option: ");
        System.out.println("1. Inserting");
        System.out.println("2. Deleting");
        int in=sc.nextInt();
       
        
        if(in==1)//Inserting
        {
        System.out.println("Please enter in which index you wanna input your value (0-9)");
        int index=sc.nextInt();
        if(index<=9)
        {
            System.out.println("Please enter which value/element you wanna input: ");
        int n=sc.nextInt();
        
        
        {
        for(int i=0;i>index-1;i--)
        {
            A[i]=A[i-1];
        }
        A[index-1]=n;
            System.out.println("Inputing element "+n+" in number "+index+" index");
        for(int x:A)
        {
            System.out.print(x+",");
        }
        }
        }
        else
        {
            System.out.println("Invalid index");
        }
        }
        if(in==2)
        {
          System.out.println("Please enter in which index you wanna delete the value (0-9)");
        int index=sc.nextInt();  
        if(index<=9)
        {
            {
                int i;
        for(  i=0;i>index-1;i++)
        {
            A[i]=A[i-1];
        }
         A[index-1]=i--;
            System.out.println("Deleting indext "+index+" Element");
        for(int x:A)
        {
            System.out.print(x+",");
        }
        }
        }
        else
        {
            System.out.println("Invalid index ");
        }
        }
        else
        {
            System.out.println("Invalid option");
        }
    }
    
}
