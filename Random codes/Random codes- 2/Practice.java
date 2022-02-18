/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website");
        String str=sc.nextLine();
        int i=str.lastIndexOf(".");
        String str1= str.substring(i+1, str.length());
        System.out.print("Domain name of the site: ");
        switch(str1)
        {
            case "com":   System.out.println("Commercial site");
            break;
            case "org": System.out.println("Organization site");
            break;
            default: System.out.println("Invalid domain");
            break;
            
        }
        //Protocol name
        System.out.print("Protocol name: ");
        int i1=str.indexOf(":");
        String str2=str.substring(0, i1);
        
        if(str2.equals("http"))
        {
            System.out.println("Hyper text transfer protocol");
        }
        else if(str2.equals("ip"))
        {
            System.out.println("Internet protocol");
        }
        else
        {
            System.out.println("Invalid protocol");
        }
        //website name
        System.out.print("Website name: ");
        String str3=str.substring(i1+1, i);
        System.out.println(str3);
        
        
        // TODO code application logic here
    }
    
}
