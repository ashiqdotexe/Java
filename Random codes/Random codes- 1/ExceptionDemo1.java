
package exceptiondemo1;

import java.util.Scanner;

public class ExceptionDemo1 {

 
    public static void main(String[] args) {
       int a,b,c;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println("Result is: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Your denominator is zero, please redefine the denominator");
        }
    }
    
}
