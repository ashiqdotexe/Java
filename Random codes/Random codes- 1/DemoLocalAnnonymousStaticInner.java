
package demolocalannonymousstaticinner;
//Local inner class>>
class Outer1
{
    void meth()
    {
        class Inner1
        {
            void Display()
            {
                System.out.println("Hello");
            }
        }
        new Inner1().Display();
       
    }
}
//Local inner class<<
//Annonymous inner class
interface out
{
    void display();
}
class Outer2 //implements out
{
    void show()
    {
        new out()
   {
       @Override
       public void display()
       {
           System.out.println("Hello outer 2");
       }
   }.display(); 
    }
  
   
  /* public void display()
   {
       System.out.println("Outer ");
   }*/
}
//Annonumous inner class<<
//Static inner class
class Outer3
{
    static int x=10;
    int y=20;
    static class Inner2
    {
        void display()
        {
            System.out.println(x);
            //System.out.println(y);//static required
        }
    }
}
 

public class DemoLocalAnnonymousStaticInner {

   
    public static void main(String[] args) {
       Outer1 o1=new Outer1();
       o1.meth();
       Outer2 o2=new Outer2();
       o2.show();
       Outer3.Inner2 i=new Outer3.Inner2();
       i.display();
    }
    
}

