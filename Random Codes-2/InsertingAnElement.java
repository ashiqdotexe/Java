/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertinganelement;
import java.util.Scanner;
/**
 *
 * @author ashiq
 */
public class InsertingAnElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[20];
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
        System.out.println("Please enter in which index you wanna input your value (1-10)");
        int index=sc.nextInt();
        
        System.out.println("Please enter which value/element you wanna input: ");
        int n=sc.nextInt();
        
        
        {
        for(int i=0;i>index;i--)
        {
            A[i]=A[i-1];
        }
        A[index]=n;
            System.out.println("Inputing element "+n+" in number "+index+" index");
        for(int x:A)
        {
            System.out.print(x+",");
        }
        }
        
        // TODO code application logic here
    }
    
}
