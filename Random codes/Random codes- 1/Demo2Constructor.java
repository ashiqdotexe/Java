/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2constructor;
class Parent
{
    public Parent() 
    {
        System.out.println("This is parent constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("This is child constructor");
    }
}
public class Demo2Constructor {

  
    public static void main(String[] args) {
        Child c=new Child();
        
    }
    
}
