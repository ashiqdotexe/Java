
package demooverriding;
class Sup
{
    public void display()
    {
        System.out.println("Super class display");
    }
}
class Sub extends Sup
{
    //@Override
    public void display(int x)
    {
        System.out.println("Sub class display");
    }
}

public class DemoOverRiding {

    
    public static void main(String[] args) {
        Sub s1=new Sub();
        s1.display();
        Sup s2=new Sup();
        s2.display();
    }
    
}
