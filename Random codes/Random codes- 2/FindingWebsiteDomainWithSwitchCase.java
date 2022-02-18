
package finding.website.domain.with.pkgswitch.pkgcase;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class FindingWebsiteDomainWithSwitchCase {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Input the name of your website: ");//www.google.com
        str=sc.nextLine();
        int i=str.lastIndexOf(".");
        String str1=str.substring(i+1, str.length());
        
        switch (str1)
        {
            case "com": System.out.println("Its a commercial site");
            break;
     
           case "org": System.out.println("Its a organization site");
            break;
            
           default: System.out.println("Invalid");
         
        }
    }
        }
    

