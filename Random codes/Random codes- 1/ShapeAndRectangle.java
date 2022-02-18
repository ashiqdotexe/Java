//HM Ashiqur Rahman
//2013941642
package shapeandrectangle;
//import java.util.Scanner;
abstract class Shape
{
    private String name;
    Shape(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape
{
    private double length;
    private double width;
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setLenWid(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    
    Rectangle(String name,double length,double width)
    {
        super(name);
        this.length=length;
        this.width=width;
    }
    @Override
    double area()
    {
        return length*width;
    }
    @Override
    double perimeter()
    {
        return 2*(length+width);
    }
}

