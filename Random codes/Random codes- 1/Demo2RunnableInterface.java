package demo2runnableinterface;
//Runnable interface
class My implements Runnable
{

    @Override
    public void run() {
        int i=1;
        while(true)
        {
            System.out.println(i+ " Hello");
            i++;
        }
    }
    
}
public class Demo2RunnableInterface {

    public static void main(String[] args) {
      My m =new My();
      Thread t=new Thread(m);
      t.start();
      int i=1;
      while(true)
      {
          System.out.println(i+" World");
          i++;
      }
    }
    
}
