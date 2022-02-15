
package demolamda;
@FunctionalInterface
interface MyLamda
{
    void display();
}

public class DemoLamda {

    
    public static void main(String[] args) {
        //Creating an annonymous inner class>>
        
        /*MyLamda m=new MyLamda()
        {
            @Override
            public void display()
            {
                System.out.println("Annonymous inner class");
            }
        };
        m.display();*/
        
        //Creating a lamda expression instead of inner class
        
        MyLamda m=()->System.out.println("Lamda expression");
        m.display();
    }
    
}
