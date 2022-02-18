
package problem.solving;

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;


public class ProblemSolving {

   
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     StringTokenizer st = new StringTokenizer(str," ");
     String str1 = st.nextToken();
          String str2  = st.nextToken();
     float  y = Float.parseFloat(str2);
     float x = Float.parseFloat(str1);
     float charges = 0.50f;
      float result = y;
      
     if((x<=(y-charges))&&(x%5==0)){
         result = y-x-charges;
         System.out.printf("%.2f",result);
     }
    else{
                System.out.printf("%.2f",result);
     }
    }
}
