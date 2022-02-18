
package demo1;
abstract class Super
{
    Super()
    {
        System.out.println("Super constructer");
    }
    void meth1()
    {
        System.out.println("Super meth 1"); 
        
    }
   abstract void meth2();
}
class Sub extends Super
{
    @Override
    void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class Demo1 {

   
    public static void main(String[] args) {
        Super s=new Sub();
        s.meth1();
        s.meth2();
    }
    
}
