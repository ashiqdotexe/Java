/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.a.digit.of.a.number.student.challenge2.pkg2;
import java.util.*;

/**
 *
 * @author ashiq
 */
public class CountADigitOfANumberStudentChallenge22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        
        while(n>0)
        {
            n=n/10;
            count++;
          
        }
        System.out.println(count);
        // TODO code application logic here
    }
    
}
