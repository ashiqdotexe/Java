
package chararrayio;
import java.io.*;
import java.io.CharArrayWriter;


public class CharArrayIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        char c[]={'a','b','c','d'};
        CharArrayReader ci= new CharArrayReader(c);
        
        int x;
        while((x=ci.read())!=-1)
        {
            System.out.println((char)x);
        }
        ci.close();
       
       
        
        
    }
    
}
