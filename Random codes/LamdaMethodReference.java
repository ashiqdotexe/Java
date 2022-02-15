
package lamdamethodreference;

interface MyLamda
{
    public void display(String str);
}
class LamdaDemo
{
    LamdaDemo(String str)
    {
        System.out.println(str.toUpperCase());
    }
}
class LamdaDemo2
{
    public void demo(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
public class LamdaMethodReference {

  
 
    public static void main(String[] args) {
       MyLamda ml=LamdaDemo::new;
       ml.display("hello");
       LamdaDemo2 ld2=new LamdaDemo2();
       MyLamda m=ld2::demo;
       ld2.demo("hello");
       
    }
    
}
