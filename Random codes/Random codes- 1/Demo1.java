//Thread class
package demo1;
class MyThread extends Thread
{
    @Override
    public void run()
    {
      int i=1;
      while(i<5)
      {
          System.out.println(i+" Hello");
      }
    }
}
public class Demo1 {

    public static void main(String[] args) {
     MyThread t=new MyThread();
     t.start();
     int i=1;
     while(i<5)
     {
         System.out.println(i+ " World");
     }
    }
    
}
