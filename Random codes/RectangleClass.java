//Area,perimeter of a rectangle
package rectangleclass;
import java.util.Scanner;
class Rectangle{
   private double length;
    private double breadth;
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else length=0;
    }
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else breadth=0;
    }
    public  double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isRec()
    {
        return length==breadth;
    }
}

public class RectangleClass {

   
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println("Enter the lenght and breadth: ");
        Scanner sc=new Scanner(System.in);
        r.setLength(sc.nextDouble());
         r.setBreadth(sc.nextDouble());
        
        System.out.println("Length is: "+r.getLength());
        System.out.println("Breadth is: "+r.getBreadth());
        System.out.println("Area of the rectangle is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
        boolean check=r.isRec();
        
        if(check==true)
        {
            System.out.println("Its a rectangle");
        }
        else System.out.println("Its not a rectangle");
    }
    
}
