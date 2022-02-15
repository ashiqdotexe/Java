
package treemapdemo;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap <Integer,String> tm=new TreeMap<>(Map.of(0, "A",1,"B",2,"C",3,"D",4,"E"));
        
        
        tm.put(5, "G");
        tm.put(7, "I");
        
        Entry <Integer,String> e=(Entry <Integer,String>) tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
    }
    
}
