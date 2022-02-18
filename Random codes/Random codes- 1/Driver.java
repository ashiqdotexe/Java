//HM Ashiqur Rahman
//2013941642
package shapeandrectangle;

import java.util.Scanner;


public class Driver {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length and width of a rectangle: ");
        Rectangle R=new Rectangle("Calculator developed by @HM Ashiqur Rahman",sc.nextDouble(),sc.nextDouble());
        Shape s=R;
        System.out.println("Area of the rectangle is: "+s.area());
        System.out.println("Perimeter of the rectangle is: "+s.perimeter());
        System.out.println("\n\n"+s.getName()+"\n");
        
        
    }
    
}
