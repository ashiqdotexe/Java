
package linkedlistdemo;
import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList <Integer> li=new LinkedList<>();
        LinkedList<Integer> li1=new LinkedList<>(List.of(20,40,50,60,70,80,90));
        li.addAll(li1);
        //li.remove(2);//Have to mention the size here
        boolean b=li.containsAll(li1);
        System.out.println(b);
        
        for(Iterator <Integer> i=li.iterator();i.hasNext();)
        {
            Integer x=i.next();
            System.out.println(x);
            
        }
    }
    
}
