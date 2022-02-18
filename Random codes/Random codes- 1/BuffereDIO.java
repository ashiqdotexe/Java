
package bufferedio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BuffereDIO {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
       /* FileOutputStream fo=new FileOutputStream("D://Java works udemy//class 23- IO Streams//New Folder//BuffereDIO//text.txt");
        String str="Hello world, This is HM Ashiqur Rahman";
        byte[] b=str.getBytes();
        fo.write(b);*/
         FileReader fi=new FileReader("D://Java works udemy//class 23- IO Streams//New Folder//BuffereDIO//text.txt");
         BufferedReader bis=new BufferedReader(fi);
         //byte b[]=new byte[bis.available()];
         
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.mark(10);
          System.out.print((char)bis.read());
          System.out.print((char)bis.read());
          System.out.print((char)bis.read());
         bis.reset();
         System.out.print((char)bis.read());
          System.out.print((char)bis.read());
          System.out.println("String is "+bis.readLine());
         
         System.out.println("\n");
         
         
       
    }
    
}
