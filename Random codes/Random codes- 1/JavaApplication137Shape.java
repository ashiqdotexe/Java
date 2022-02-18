
package javaapplication137shape;
import java.util.Scanner;
abstract class Shape
{
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape
{
    private double r;
    double getRadius()
    {
        return r;
    }
    void setRadius(int r)
    {
        this.r=r;
    }
    @Override
    void perimeter()
    {
        System.out.println("Perimeter is: "+2*r*Math.PI);
    }
    @Override
    void area()
    {
        System.out.println("Area is: "+r*r*Math.PI);
    }
    
}
class Rectangle extends Shape
{
    private double length;
    private double breadth;
    double getBreadth()
    {
        return breadth;
    }
    double getLenght()
    {
        return length;
    }
    void setPro(double l,double breadth)
    {
        this.length=l;
        this.breadth=breadth;
    }
    
    @Override
    void perimeter()
    {
        System.out.println("Perimeter is: "+2*(length+breadth));
    }
    @Override
    void area()
    {
        System.out.println("Area is: "+length*breadth);
    }
}
public class JavaApplication137Shape {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        Rectangle R=new Rectangle();
        Shape s=R;
        System.out.println("Enter the radius: ");
        c.setRadius(sc.nextInt());
        c.perimeter();
        c.area();
        System.out.println("Enter the value of Length and Breadth: ");
        R.setPro(sc.nextDouble(), sc.nextDouble());
        s.perimeter();
        s.area();
    }
    
}
