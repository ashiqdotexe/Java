
package demoparameterizedlamda;

interface MyLamda
{
    int add(int x, int y);
}
public class DemoParameterizedLamda {

  
    public static void main(String[] args) {
        MyLamda m=(a,b)-> a+b;
        System.out.println(m.add(2,3));
    }
    
}
