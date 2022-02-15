
package priorityqueuedemo;

import java.util.*;
public class PriorityQueueDemo {

    
    public static void main(String[] args) {
       PriorityQueue <Integer> q=new PriorityQueue<>(List.of(10,20,5,40,5,10,20));
       
       q.forEach(n->System.out.println(n));
    }
    
}
