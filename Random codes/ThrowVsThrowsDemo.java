
package throwvsthrowsdemo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class NegativeDim extends Exception
{
    public String toString()
    {
        return "You have entered a negative number ";
    }
}
class Area 
{
    
    
        public static int areaMethod(int l, int b) throws NegativeDim
        {
          if(l<0 || b<0)
        {
             
            throw new NegativeDim();  
        }  
          return l*b;
        }
        
        
   
}


public class ThrowVsThrowsDemo {

 
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         try{
             Area a=new Area();
            
             System.out.println(a.areaMethod(sc.nextInt(),sc.nextInt()));
         }
         catch(NegativeDim n)
         {
             System.out.println(n);
         }
        
       
    }
    
}
