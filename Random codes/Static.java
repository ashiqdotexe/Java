
package pkgstatic;
import java.util.*;
class Account
{
   private String AccountNum;
    private static int count=1;
    private static String assignAccountNum()
    {
        Date d=new Date();
        String str=("Acc-"+(d.getYear()+1900))+"-"+count;
        count++;
        return str;
    }
    public Account()
    {
        this.AccountNum=assignAccountNum();
    }
    public String getAccountNum()
    {
        return AccountNum;
    }
}
public class Static {

  
    public static void main(String[] args) {
        Account A1=new Account();
        Account A2=new Account();
        Account A3=new Account();
        System.out.println(A1.getAccountNum());
        System.out.println(A2.getAccountNum());
        System.out.println(A3.getAccountNum());
        
        
    }
    
}
