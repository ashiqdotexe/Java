
package demomultithreadconstructor;

import java.util.logging.Level;
import java.util.logging.Logger;


class My extends Thread
{
    public My(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY-1);
    }
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i++);
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Got interupted");
                i++;
            }
        }
    }
}
public class DemoMultiThreadConstructor {


    public static void main(String[] args) {
        My m=new My("HM Ashiqur");
         Thread t=new Thread(m);  
       
        System.out.println(t.getId());
        t.getName();
          System.out.println(t.getPriority());
        System.out.println(t.getState());
       
        t.start();
         t.interrupt();
       
        
    }
    
}
