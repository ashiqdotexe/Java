
package demorandomfileaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class DemoRandomFileAccess {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //A B C D F G H I J
        RandomAccessFile fs=new RandomAccessFile("D://Java works udemy//class 23- IO Streams//Demo//DemoRandomFileAccess//source.txt","rw");
        System.out.println((char)fs.read());
        System.out.println((char)fs.read());
        System.out.println((char)fs.read());
        fs.write('d');
        System.out.println((char)fs.read());
        fs.seek(2);
        System.out.println((char)fs.read());
        fs.getFilePointer();
        fs.seek(fs.getFilePointer()+2);
        System.out.println((char)fs.read());
    
}
}