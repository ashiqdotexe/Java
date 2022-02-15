/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_challenge.pkg02.pkg1.display.digit;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class Student_Challenge021DisplayDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        
        
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            System.out.println(rem);
        }
        //System.out.println(num);
        
        // TODO code application logic here
    }
    
}
