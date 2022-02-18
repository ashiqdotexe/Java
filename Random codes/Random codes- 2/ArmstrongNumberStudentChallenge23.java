/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong.number.student.challenge.pkg2.pkg3;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class ArmstrongNumberStudentChallenge23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number ");
        int n=sc.nextInt();
        
        int m=n,sum=0,r;
        
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            
            sum=sum+r*r*r;
            
        }//n=0
        
        if(m==sum)
        {
            System.out.println("Its  an armstrong number ");
        }
        else
        {
            System.out.println("Its not an armstrong number ");
        }
        
        
        // TODO code application logic here
    }
    
}
