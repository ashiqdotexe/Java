/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.number;
import java.util.Scanner;
/**
 *
 * @author ashiq
 */
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms you wanna print: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int c;
        
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            
            a=b;
            b=c;
        }
    }
    
}
