
package membercustomer;
import java.util.Scanner;
interface Member
{
    void CallBack();
}
class Store
{
    Member [] mem=new Member[100];
    int count=0;
    void register(Member m)
    {
         mem [count++]=m;
    }
    void inviteSales()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].CallBack();
        }
    }
}
class Customer implements Member
{
    String name;
    Customer(String name)
    {
        this.name=name;
    }
    @Override
    public void CallBack()
    {
        System.out.println("Ok I am calling "+name);
    }
}

public class MemberCustomer {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st customer name: ");
       Customer c1=new Customer(sc.nextLine());
        System.out.println("Enter 2nd customer name: ");
       Customer c2=new Customer(sc.nextLine());
       Store s=new Store();
       s.register(c1);
       s.register(c2);
       s.inviteSales();
    }
    
}
