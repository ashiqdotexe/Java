/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderio;

import java.io.File;

/**
 *
 * @author ashiq
 */
public class FileReaderIo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\Java works udemy\\class 23- IO Streams\\Demo\\FileReaderIo");
        boolean br=f.isDirectory();
        System.out.println(br);
        File fi[]=f.listFiles();
        
        for(File x:fi)
        {
            System.out.println(x.getName()+" ");
            //System.out.println(x.getPath());
        }
    
    
}
}

