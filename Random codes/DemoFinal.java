
package demofinal;
final class Test1
{
    
}
/*class Test2 extends Test1
{
    
}*///Cant extend a final class
class Demo
{
   public final void display()
    {
        
    }
}
class Demo2 extends Demo
{
    /*public void display()
    {
       //cant override a final method 
    }*/
}


public class DemoFinal {
     final  double PI;
    /*static
    {
    PI=3.14;
    }*/
    public  DemoFinal()
    {
        PI=1.3;
    }
    

    public static void main(String[] args) {
        
    }
    
}
