
package demo1;
interface Test1
{
    void meth1();
    void meth2();
}
class Test2 implements Test1
{
    @Override
    public void meth1()
    {
        System.out.println("Sub method 1");
    }
    @Override
    public void meth2()
    {
        System.out.println("Sub method 2");
    }
    public void meth3()
    {
        System.out.println("Sub method 3");
    }
}
public class Demo1 {

    
    public static void main(String[] args) {
      Test1 T1=new Test2();
      T1.meth1();
      T1.meth2();
    }
    
}
