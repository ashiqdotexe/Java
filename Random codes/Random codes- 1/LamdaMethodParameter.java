
package lamdamethodparameter;

interface MyLamda
{
    public void display();
}
class UseLamda
{
    public void display(MyLamda ml)
    {
        ml.display();
    }
}
class Demo
{
    public void meth1()
    {
        UseLamda ul=new UseLamda();
        ul.display(()->{System.out.println("Hello world");});
    }
}
public class LamdaMethodParameter {

 
    public static void main(String[] args) {
        Demo d=new Demo();
        d.meth1();
    }
    
}
