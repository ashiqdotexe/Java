
package arraychange;


public class ArrayChange {

    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    public static void main(String[] args) {
       int  A[]={1,2,3,4,5};
       change(A,2,15);
       for(int x:A)
       {
           System.out.print(x+",");
       }
    }
    
}
