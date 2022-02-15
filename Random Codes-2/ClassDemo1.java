
package classdemo1;

public class ClassDemo1 {
   /* static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

   
    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println(max(a,b));
        
    }*///Simple Parameter Passing
    
      static void inc(int x) //changing the value of formal parameter wont change the value of actual parameter
    {
           x++;
            System.out.println(x);
    }

   
    public static void main(String[] args) {
        int a=10,b=15;
        inc(a);
        System.out.println(a);
        
    }
    
}
