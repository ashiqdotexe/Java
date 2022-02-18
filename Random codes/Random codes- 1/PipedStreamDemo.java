
package pipedstreamdemo;

import java.io.*;



class Producer extends Thread
{
    OutputStream os;
    
    public Producer(OutputStream os)
    {
        this.os=os;
    }
    @Override
    public void run() 
    {
        int count=0;
        
        while(true)
        {
            try {os.write(count);
            os.flush();
                    System.out.println("Producer "+count);
                    System.out.flush();
                    Thread.sleep(10);
                    count++;
                    
                      } catch (Exception ex) {}
        }
    }
}

class Consumer extends Thread
{
    InputStream is;
    
    public Consumer(InputStream is)
    {
        this.is=is;
    }
    @Override
    public void run() 
    {
      int x;
        
        while(true)
        {
          try {
              x=is.read();
              System.out.println("Consumer "+x);
              System.out.flush();
              Thread.sleep(10);
          } catch (Exception ex) {
              
          }
                    
                    
                      
        }
    }
}

public class PipedStreamDemo {

    public static void main(String[] args)  throws Exception{
      PipedOutputStream po=new PipedOutputStream();
      PipedInputStream pi=new PipedInputStream();
      pi.connect(po);
      Producer p=new Producer(po);
      Consumer c=new Consumer(pi);
      p.start();
      c.start();
    }
    
}
