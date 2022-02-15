
package checkeduncheckeddemo;

class LowBalance extends Exception
{
    @Override
    public String toString()
    {
        return "You do not have sufficient balance";
    }
}
public class CheckedUncheckedDemo {
      public static void fun1()
      { 
          try{
             throw new LowBalance(); 
          }
          catch(LowBalance e)
          {
              System.out.println(e);
          }
      }
      public static void fun2()
      {
          fun1();
      }
  
    public static void main(String[] args) {
        fun2();
    }
    
}
