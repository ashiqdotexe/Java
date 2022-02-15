
package cylinderclass;
import java.util.Scanner;
class Cylinder{
       private double radius;
        private double height;
        public double getRadius()
        {
            return radius;
        }
        public double getHeigth()
        {
            return height;
        }
        public void setRadius(double r)
        {
            if(r>=0)radius=r;
            else radius=0;
        }
        public void setHeight(double h)
        {
            if(h>=0) height=h;
            else height=0;
        }
        public Cylinder()
        {
            radius=0;
            height=0;
        }
        public Cylinder(double r)
        {
            height=1;
            radius=r;
            
        }
        public Cylinder(double r,double h)
        {
            
            radius=r;
            height=h;
        }
        public double lidArea()
        {
            return Math.PI*radius*radius;
        }
        public double totalSurfaceArea()
        {
            return 2*lidArea()+circumsference()*height;
        }
        public double volume()
        {
            return lidArea()*height;
        }
        public double circumsference()
        {
            return 2*Math.PI*radius;
        }
    }
public class CylinderClass {
    
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and height: ");
        Cylinder c=new Cylinder();
        c.setHeight(sc.nextDouble());
        c.setRadius(sc.nextDouble());
       
        
        
        System.out.println("Lid Area is: "+c.lidArea());
        System.out.println("Total Area: "+c.totalSurfaceArea());
        System.out.println("Volume is"+c.volume());
        //System.out.println("Circums");
    }
    
}
