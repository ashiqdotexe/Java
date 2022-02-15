
package studentchallengeio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class StudentChallengeIO {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fo;
        FileOutputStream f;
        SequenceInputStream sus;
        try (FileInputStream fi = new FileInputStream("D:/Java works udemy/class 23- IO Streams/New Folder/StudentChallengeIO//source.txt")) {
            fo = new FileInputStream("D:/Java works udemy/class 23- IO Streams/New Folder/StudentChallengeIO//source1.txt");
            f = new FileOutputStream("D:/Java works udemy/class 23- IO Streams/New Folder/StudentChallengeIO//source2.txt");
            sus = new  SequenceInputStream(fi,fo);
            int b;
            while((b=sus.read())!=-1)
            {
                f.write(b);
            }
        }
        fo.close();
        sus.close();
        f.close();
      
      
         
}
}