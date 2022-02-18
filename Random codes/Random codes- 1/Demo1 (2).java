
package demo1;
class Outer
{
    int x=10;
    Inner i=new Inner();
    class Inner
    {
        int y=20;
        void display()
        {
            System.out.println(x+" "+y);
        }
        
    }
    void outerDisplay()
    {
        i.display();
        System.out.println(i.y);
    }
}

public class Demo1 {

    
    public static void main(String[] args) {
       Outer o=new Outer();
       o.outerDisplay();
       Outer.Inner oi=new Outer(). new Inner();
       oi.display();
    }
    
}
