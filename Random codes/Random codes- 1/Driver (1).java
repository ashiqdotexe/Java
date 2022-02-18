/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentname;

import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class Driver {
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
