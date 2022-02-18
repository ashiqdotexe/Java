
package overloadedmethodcalcareas;
import java.util.Scanner;

public class OverloadedMethodCalcAreas {


    static double area(double l,double b)
    {
        return l*b;
        
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
    static float area(float h,float a, float b)
    {
        return (a+b)*(h)/(2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your option:");
        System.out.println("1. Area of rectangle");
        System.out.println("2. Area of circle");
        System.out.println("3. Area of tropism");
        int n=sc.nextInt();
        
        if(n==1)
        {
            System.out.println("Enter the value of length and breadth");
            double l=sc.nextDouble();
            double b=sc.nextDouble();
            System.out.println("Area of rectangle is "+area(l,b));
        }
        else if(n==2)
        {
            System.out.println("Enter the value of radius");
            double r=sc.nextInt();
            //double x=area(r);
            System.out.printf("Area of circle is: %.2f ",area(r));
        }
        else
        {
            System.out.println("Enter the value of a, b and height");
            float a=sc.nextFloat();
            float b=sc.nextFloat();
            float h=sc.nextFloat();
            float x=area(a,b,h);
            System.out.println("Area of Tropism is: "+x);
        }
    }
    
}
