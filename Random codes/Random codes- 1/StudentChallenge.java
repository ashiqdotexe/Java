
package studentchallenge;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class StudentChallenge {

    
 
    public static void main(String[] args) throws Exception {
       float [] f={2.3f,4.5f,3.2f,8.9f};
       FileOutputStream fos=new FileOutputStream("D:\\Java works udemy\\class 23- IO Streams\\Student Challenge\\StudentChallenge\\Demo.txt");
       DataOutputStream os=new DataOutputStream (fos);
       os.writeInt(f.length);
       
       for(float x:f)
       {
           os.writeFloat(x);
       }
       os.close();
       fos.close();
       
       FileInputStream fis=new FileInputStream("D:\\Java works udemy\\class 23- IO Streams\\Student Challenge\\StudentChallenge\\Demo.txt");
       DataInputStream oi=new DataInputStream (fis);
       int length=oi.readInt();
       
       for(int i=0;i<length;i++)
       {
         float data=oi.readFloat();
           System.out.println(data);
       }
       oi.close();
       fis.close();
    }
    
    
    
     
    
}
