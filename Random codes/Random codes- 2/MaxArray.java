
package maxarray;


public class MaxArray {

    static int max(int A[], int max)
    {
         
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            max=A[i];
        }
        return max;
    }
    public static void main(String[] args) {
       int A[]={1,2,3,7,4,10,80,9};
        System.out.println("The array is: ");
       for(int y:A)
        {
            System.out.print(y+",");
        }
        System.out.println("");
       int max=A[0];
       //int x=max(A,max);
        System.out.println("The max value is: "+max(A,max));
    }
    
}
