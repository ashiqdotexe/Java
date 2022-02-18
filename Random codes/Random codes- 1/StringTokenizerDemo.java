
package stringtokenizer;

import java.util.StringTokenizer;


public class StringTokenizerDemo {

  
    public static void main(String[] args) {
        String str="name=HM Ashiqur Rahman;Roll=2013941642;Department=ECE";
        
        StringTokenizer st=new StringTokenizer(str,"=;");
        String s;
        while(st.hasMoreTokens())
        {
            s=st.nextToken();
            System.out.println(s);
        }
    }
    
}
