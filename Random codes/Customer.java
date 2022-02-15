
package customer;
import java.io.*;
import java.io.Serializable;

class Customer1 implements Serializable
{
    String custID;
    String name;
    String phnNo;
    int count=1;
    Customer1(){}
    Customer1(String name, String phnNo)
    {
        custID="C"+count;
        count++;
        this.name=name;
        this.phnNo=phnNo;
    }
    @Override
    public String toString()
    {
        return "Customer details"+"\nCustomer ID "+custID+"\nCustomer Name: "+name+"\nCustomer phone number: "+phnNo; 
    }
}
public class Customer  {

    
    /*public static void main(String[] args) throws Exception {
        Customer1 [] c={new Customer1("Ashiqur","102"),new Customer1("Adnanur","103"),new Customer1("Azizur","104")};
        FileOutputStream fos=new FileOutputStream("D:\\Java works udemy\\class 23- IO Streams\\Student Challenge\\Customer\\Demo.txt");
        ObjectOutputStream os=new ObjectOutputStream(fos);
        
        os.writeInt(c.length);
        for(Customer1 x:c)
        {
            os.writeObject(x);
        }
    }*/
     public static void main(String[] args) throws Exception {
        
        FileInputStream fos=new FileInputStream("D:\\Java works udemy\\class 23- IO Streams\\Student Challenge\\Customer\\Demo.txt");
        ObjectInputStream os=new ObjectInputStream(fos);
        
       int length=os.readInt();
       
       Customer1[] c=new Customer1[length];
       
       for(int i=0;i<length;i++)
       {
           c[i]=(Customer1)os.readObject();
       }
       java.util.Scanner sc= new java.util.Scanner(System.in);
         System.out.println("Enter a name");
       String name=sc.nextLine();
       
       for(int i=0;i<length;i++)
       {
           
           if(name.equalsIgnoreCase(c[i].name))
           {
               System.out.println(c[i]); 
           }
       }
       os.close();
       fos.close();
    }
    
}
