
package demoofsuper;
import java.util.Scanner;
class Rectangle
{
    int lenght;
    int breadth;
    int x=10;
    Rectangle(int length,int breadth)
            
    {
        this.lenght=length;
        this.breadth=breadth;
    }
    
}
class Cuboid extends Rectangle
{
    int x=20;
    int height;
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
    void area()
    {
        int area;
        area=lenght*breadth*height;
        System.out.println("Area is "+area);
    }
}

public class DemoOfSuper {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cuboid c=new Cuboid(sc.nextInt(),sc.nextInt(),sc.nextInt());
        c.display();
        c.area();
        
    }
    
}
