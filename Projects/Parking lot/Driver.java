
package parkinglotproject;

import java.util.Scanner;


public class Driver {

   
    public static void main(String[] args) {
                       Scanner sc=new Scanner(System.in);
                       System.out.println("");
	System.out.println("                                            ");
	System.out.println("    =============================           ");
	System.out.println("     VEHICLE PARKING MANAGEMENT             ");
	System.out.println("    =============================           ");
	System.out.println("                                            ");
	System.out.println("      Welcome to Parking Lot Project(By AIA)   ");//Ashiqur, Irfan and Ahad's project
	System.out.println("                                            ");
	System.out.println("       HM Ashiqur Rahman                    ");
	System.out.println("                                            ");
	System.out.println("       Contact:017*****720                  ");
	System.out.println("                                            ");
	System.out.println("         Irfanul Haque Sajid                       ");
	System.out.println("                                            ");
	System.out.println("       CONTACT:019*****887                  ");
	System.out.println("                                            ");
	System.out.println("       Al Ahad Monir                  ");
	System.out.println("                                            ");
	System.out.println("         CONTACT:018*****456                  ");
	System.out.println("                                            ");
	System.out.println("\t\t");
	System.out.println(" \t Press Any Key To Continue:");
                   sc.nextLine();
        String user,pass;
        System.out.println("Enter the username: ");
        user=sc.nextLine();
        System.out.println("Enter the password");
        pass=sc.nextLine();
        try
        {
        if(user.equals("HMAshiqur") && pass.equals("IrfanMonir"))
        {
            System.out.println("\n==========Login successfull=========\n");
            ChooseOption co=new ChooseOption();
            co.optionChoose();
                      
        }
        else
        {
            System.out.println("Incorrect password");
        }
        }
        catch(Exception e)
        {
            System.out.println("!!!!!!!!Invalid option!!!!!!!!");
        }
         System.out.println("=========\n          Thank you | Application has terminated\n                                                    ==========");

    }
    
}
