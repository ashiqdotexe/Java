
package arraylist;


import java.util.*;

public class ArrayListDemo {

    
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>(20);
        ArrayList <Integer> a=new ArrayList<>(List.of(20,30,40,50,60,70,80,90,100));
        al.add(10);
        al.add(0,10);
        al.addAll(a);
        System.out.println(al.contains(20));
        
        al.forEach(n-> show(n));
        
        
    }
    public static void show(int n)
    {
        if(n>60)
        {
            System.out.println(n);
        }
    }
    
}
