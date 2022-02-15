
package demointercommunicationsynchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

class Mydata
{
    boolean flag=true;
    int value=0;
    synchronized public void setValue(int v)
    {
        while(flag!=true)
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mydata.class.getName()).log(Level.SEVERE, null, ex);
            }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int getValue()
    {
        int x=0;
          while(flag!=false)
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mydata.class.getName()).log(Level.SEVERE, null, ex);
            }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Product extends Thread
{
    int count=1;
    Mydata d;
    Product(Mydata d)
    {
       this.d=d;
    }
    public void run()
    {
        while(true)
        {
        d.setValue(count);
        System.out.println("Producer "+count);
        count++;
    }
    }
}
class Consumer extends Thread
{
    Mydata d;
    int value;
    Consumer(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        value=d.getValue();
        System.out.println("Consumer "+value);
    }
}
public class DemoInterCommunicationSynchronization {


    public static void main(String[] args) {
        Mydata d=new Mydata();
        Product p=new Product(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
    
}
