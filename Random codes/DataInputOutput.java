/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datainputoutput;

import java.io.*;
class Student
{
    int rollNo;
    String name;
    String dept;
}
        
       
public class DataInputOutput {

   
    public static void main(String[] args) throws Exception {
       FileInputStream fo=new FileInputStream("D:\\Java works udemy\\class 23- IO Streams\\Demo\\DataInputOutput\\Demo.txt");
       DataInputStream dr=new DataInputStream(fo);
       
       Student s=new Student();
       
       s.rollNo=dr.readInt();
       s.name=dr.readUTF();
       s.dept=dr.readUTF();
       
        System.out.println("Roll number is "+s.rollNo);
        System.out.println("Name is: "+s.name);
        System.out.println("Department is "+s.dept);
    }
    
}
