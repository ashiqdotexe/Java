/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmao;
import java.util.*;

/**
 *
 * @author ashiq
 */
public class LinkedHashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> lm=new LinkedHashMap<>(5,0.75f,false)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
        };
        lm.put(0, "A");
        lm.put(1, "B");
        lm.put(2, "C");
        lm.put(3, "D");
        lm.put(4, "E");
        lm.put(5, "F");
        lm.put(6, "G");
        String s=lm.get(2);
        s=lm.get(5);
        
        
        lm.forEach((k,v)-> System.out.println(k+" "+v));
    }
    
}
