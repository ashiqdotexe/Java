
package demogeneric;


public class DemoGeneric<T> {
    
    T[] data=(T[]) new Object[3];

    
    public static void main(String[] args) {
        DemoGeneric<Integer> gd=new DemoGeneric();
        gd.data[0]=10;
        gd.data[1]=20;
        
        int str=gd.data[0];
        int str1=gd.data[1];
        
    }
    
}
