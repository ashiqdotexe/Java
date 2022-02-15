
 
package radix.of.a.number;
import java.util.Scanner;



public class RadixOfANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a number: ");
        str=sc.nextLine();
        
        if(str.matches("[01]*"))
        { System.out.println("The number is a binary number and it's radix is 2" );
        
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("The number is a octal number and it's radix is 8" );
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("Its a decimal number and radix is 10");
        }
        else if(str.matches("[0-9A-Z]+"))
        {
            System.out.println("Its a hexa decimal number and radix is  16");
        }
        else
        {
            System.out.println("Its an invalid number");
        }
        
        
       
    }
    
}
