
package demogenericarray;

class Array <T>
{
    T[] A=(T[]) new Object[10];
    int length=0;
    
    public void append(T s)
    {
        A[length++]=s; 
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class DemoGenericArray {

   
    public static void main(String[] args) {
        Array <Integer> m=new Array<>();
        
        m.append(10);
        m.append(20);
        m.append(30);
        m.append(40);
        
        m.display();
    }
    
}
