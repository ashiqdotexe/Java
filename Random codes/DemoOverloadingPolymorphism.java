
package demooverloadingpolymorphism;

class Test
{
    int max(int a,int b)
    {
        return a>b?a:b;
    }
    int max(int a,int b,int c)
    {
        if (a>b && a>c)return a;
        else if(b>c)return b;
        else return c;
    }
}
public class DemoOverloadingPolymorphism {

    
    public static void main(String[] args) {
        Test t=new Test();
        t.max(2, 1);
        System.out.println(t.max(2, 1, 3));
    }
    
}
