
package demoschinchronization;

class Mydata
{
    
   synchronized public void display(String str)
    {
       
        {
        for(int i=1;i<str.length();i++)
        {
            System.out.println(str.charAt(i));//critical section
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
    }
}
class MyThread1 extends Thread
{
    Mydata d;
    MyThread1(Mydata data1)
    {
        d=data1;
    }
    public void run()
    {
        System.out.print("Hello world ");
    }
}
class MyThread2 extends Thread
{
    Mydata d;
    MyThread2(Mydata data2)
    {
        d=data2;
    }
    public void run()
    {
        System.out.print("Welcome all");
    }
}
public class DemoSchinchronization {

   
    public static void main(String[] args) {
        Mydata d=new Mydata();
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
        t1.start();
        t2.start();
    }
    
}
