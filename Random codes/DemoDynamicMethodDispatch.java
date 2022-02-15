
package demodynamicmethoddispatch;
class Super
{
    void meth1()
    {
        System.out.println("Super meth1");
    }
    void meth2()
    {
        System.out.println("Sub meth2");
    }
}
class Sub extends Super
{
    @Override
    void meth2()
    {
        System.out.println("Sub meth2");
    }
    void meth3()
    {
        System.out.println("Sub meth3");
    }
}

public class DemoDynamicMethodDispatch {

   
     
    public static void main(String[] args) {
        Super sup=new Sub();
        sup.meth1();
        sup.meth2();
    }
    
}
