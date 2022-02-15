/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedtypegenerics;
class A{
   A(String str)
   {
       str="";
   }
}

class B extends A{}

class C extends A{}


class MyArray<T extends Object>
{
   T[] a=(T[]) new Object[10];
   int length=0;
   
   public void append(T v)
   {
       a[length++]=v;
   }
   public void display()
   {
       for(int i=0;i<length;i++)
       {
           System.out.println(a[i]);
       }
   }
}

public class BoundedTypeGenerics {

     static void show(MyArray<String> obj)
     {
         obj.append("Hello");
     }
   
    public static void main(String[] args) {
        MyArray<String> m1=new MyArray<>();
        MyArray<String> m2=new MyArray<>();
        show(m1);
        show(m2);
    }
    
}
