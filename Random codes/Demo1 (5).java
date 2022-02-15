/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

class Circle
{
   public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circum()
    {
        return perimeter();
    }
}
class Cylinder extends Circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
public class Demo1 {

  
    public static void main(String[] args) {
     Cylinder c=new Cylinder();
     c.height=10.00;
     c.radius=2.00;
     
        System.out.format("Area is: %.2f  ",c.area());
        System.out.format("\nVolume is: %.2f\n",c.volume());
    }
    
}
