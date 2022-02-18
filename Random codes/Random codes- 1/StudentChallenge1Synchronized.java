
package studentchallenge1synchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

class Atm
{
    synchronized public void checkBalance(String name)
    {
        try {
            System.out.print(name+" Checking ");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Atm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" Balance ");
    }
   synchronized public void withdrawAmount(String name,int amt)
    {
        try {
            System.out.print(name+" is withdrawing ");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Atm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(amt);
    }
}
class Customer extends Thread
{
    String name;
    Atm a;
    int amt;
    Customer(String n,Atm atm,int am)
    {
        name=n;
        a=atm;
        amt=am;
    }
    void useAtm()
    {
        a.checkBalance(name);
        a.withdrawAmount(name, amt);
    }
    @Override
    public void run()
    {
        useAtm();
    }
}

public class StudentChallenge1Synchronized {

    
    public static void main(String[] args) {
      Atm a=new Atm();
      Customer c1=new Customer("Sohan",a,100);
      Customer c2=new Customer("Rohan",a,200);
      c1.start();
      c2.start();
    }
    
}
