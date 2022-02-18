
package studentname;
import java.util.Scanner;
class Student{
    public int roll;
    public String name;
    public String course;
    public int marks=3;// You can edit this
    public int sum=0;
    public int total=300;// You can edit this
    public int studentMarks()
    {
        Scanner sc=new Scanner(System.in);
       
        for(int i=1;i<=marks;i++)
        {
            System.out.println("Enter the subject "+i+" marks: ");
            int n=sc.nextInt();
            sum+=n;
        }
        return sum;      
       
      
    }
    
    public int average()
    {
        return sum/marks;
    }
    public char grade()
    {
        if(average()>=60)return 'A';
        else if(average()<60 && average()>=50) return 'B';
        else return 'F';
                
    }
    public String details()
    {
        return "Name is: "+name+"\n Roll is: "+roll+"\n Course name is: "+course;
    }
        
}    

public class StudentName {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter your name: ");
        s.name=sc.nextLine();
        System.out.println("Enter your roll: ");
        s.roll=sc.nextInt();
        System.out.println("Enter your course name: ");
        sc.nextLine();
        s.course=sc.nextLine();
        
        System.out.println(s.details());
        /*System.out.println("Enter how many subject you wanna count(You can only input 3 subjects: ");
        s.marks=sc.nextInt();*/
        
        System.out.println("Total Mark is: "+s.studentMarks()+" out of "+s.total);
        System.out.println("Average is: "+s.average());
        System.out.println("The grade is "+s.grade());
        
       
        
    }
    
}
