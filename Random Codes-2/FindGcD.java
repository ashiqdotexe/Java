
package findgcd;
import java.util.Scanner;

public class FindGcD {

     int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
       // int x=gcd(m,n);
        FindGcD x=new FindGcD();
        System.out.println("GCD is: "+x.gcd(m,n));
    }
    
}
