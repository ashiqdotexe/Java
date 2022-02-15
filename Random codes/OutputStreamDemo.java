
package outputstreamdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputStreamDemo {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try ( FileInputStream fi=new FileInputStream("D://Java works udemy//class 23- IO Streams//New Folder//OutputStreamDemo//text.txt");) {

            byte[] b=new byte[fi.available()];
            fi.read(b);
            String s=new String(b);
            System.out.println(s);
        }
    }
    
}
