
package arraydeque;
import java.util.*;

public class ArrayDequeDemo {

    
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);
        dq.pollLast();
        dq.offerLast(70);
        dq.offerFirst(90);
        dq.offerFirst(80);
        
        dq.forEach(n-> System.out.println(n));
    }
    
}
