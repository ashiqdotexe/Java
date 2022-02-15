/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.challenge.pkg3.reverse.a.number;
import java.util.*;
/**
 *
 * @author ashiq
 */
public class StudentChallenge3ReverseANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Input a number: ");
        int n=sc.nextInt();
         int m=n;
        int rev=0;
        
        while(n>0)
        {
          int r=n%10;
          n=n/10;
          rev=(rev*10)+r;
        }
        System.out.println(rev);*/ //Reverse of a number
        
          Scanner sc=new Scanner(System.in);
        System.out.println("Input a number: ");
        int n=sc.nextInt();
         int m=n;
        int rev=0;
        
        while(n>0)
        {
          int r=n%10;
          n=n/10;
          rev=(rev*10)+r;
        }
        if(rev==m)
        
            System.out.println("palindrome");
      
        else
            System.out.println("Not a palindrome");
        
        // TODO code application logic here
    }
    
}
