
package demodaemonjoin;

import java.util.logging.Level;
import java.util.logging.Logger;

class My extends Thread
{
    @Override
    public void run()
    {
       int i=1;
       while(true)
       {
           System.out.println(i++ +" Hello");
       }
    }
}
public class DemoDaemonJoin {


    public static void main(String[] args) {
        My m=new My();
        Thread t=new Thread(m);
        //t.setDaemon(true);
        t.start();
        /*try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoDaemonJoin.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          int i=1;
       while(true)
       {
           System.out.println(i++ +" World"); 
           Thread.yield();
       }
    }
    
}
