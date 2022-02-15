//Bound type generic Demo
package boundtypegeneric;

@SuppressWarnings ("unchecked")
class A{
   A(String str)
   {
       str="";
   }
}

class B extends A{}

class C extends A{}


class MyArray<T extends A>
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
public class BoundTypeGeneric {

   
    public static void main(String[] args) {
        MyArray<C> m=new MyArray();
        
        
    }
    
}
