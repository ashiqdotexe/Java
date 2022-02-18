
package exceptiondemo2;


public class ExceptionDemo2 {

    public static void main(String[] args) {
        try
        {
            int A[]={30,50,60,0,2};
            try
            {
               
               int c=A[1]/A[3];
              System.out.println("Result is: "+c); 
              System.out.println(A[10]);
            }
            
           catch(ArithmeticException e)
           {
               System.out.println("The denominator is 0, please redefine it");
           }
        }
       
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index number");
        }
    }
    
}
