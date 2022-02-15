
package sumofdigit;

import java.util.*;
public class SumofDigit {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       int T=sc.nextInt();
       int sum=0;
       
       while(T-->0)
       {
           int x=sc.nextInt();
           while(x!=0){
		    {
		        sum=sum+x%10;
		        x/=10;
                          }
           System.out.println(sum);
           
       }
        
    }
    
}
}
