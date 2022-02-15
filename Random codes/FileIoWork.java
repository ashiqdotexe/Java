
package fileiowork;


import java.io.*;
import java.util.*;
public class FileIoWork {
  public static void main(String[] args) {
    try {
    	System.out.println("Write Something :");
    	FileWriter fw = new FileWriter("File.txt");
    	Scanner Scan = new Scanner(System.in);
    	String S = Scan.nextLine();
    	Scan.close();
      	fw.write(S);
      	fw.close();	
    }
    catch (IOException ex) 
    {
      System.out.println("An error occurred while running.");
      ex.printStackTrace();
    }
  }
}
