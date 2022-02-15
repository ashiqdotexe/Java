
package printstreamdemo;
import java.io.*;
class Student
{
    int rollNo;
    String name;
    String dept;
}
        
       
public class PrintStreamDemo {

   
    public static void main(String[] args) throws Exception {
       FileReader fo=new FileReader("D:\\Java works udemy\\class 23- IO Streams\\Demo\\PrintStreamDemo\\Demo.txt");
       BufferedReader bo=new BufferedReader(fo);
       
       Student s=new Student();
       s.rollNo=Integer.parseInt(bo.readLine());
       s.name=bo.readLine();
       s.dept=bo.readLine();
       
        System.out.println("Roll number: "+s.rollNo);
        System.out.println("Name of the student: "+s.name);
        System.out.println("Department of the student: "+s.dept);
    }
    
}
