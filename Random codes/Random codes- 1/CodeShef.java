
package codeshef;
import java.util.*;

public class CodeShef {

    

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       int rem;
       
       while(T-->0)
       {
           int a,b;
           a=sc.nextInt();
           b=sc.nextInt();
           rem=a%b;
           System.out.println(rem);
       }
    }
    
}
