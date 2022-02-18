
package isprime;
import java.util.Scanner;

public class IsPrime {
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
       int  n=sc.nextInt();
       isPrime(n);
       boolean check=isPrime(n);
       if(check==false)
       {
           System.out.println("It's not a prime number");
       }
       else
       {
           System.out.println("Its a prime number");
       }
    }
     static boolean isPrime(int n)
    {
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
                return false;     
        }
        return true;
    }

}
        //19