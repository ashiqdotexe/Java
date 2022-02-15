
package parkinglotproject;

import java.util.Scanner;


public class BalanceChoosing extends BalanceChecker {
    public void balanceChoose()
    {
        System.out.println("Please select an option: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Car balance");
        System.out.println("2. Bike balance");
        System.out.println("3. Bus balance");
        System.out.println("4. Truck balance");
        System.out.println("5. Total Balance");
        System.out.println("6. Back");
        BalanceChecker bc=new BalanceChecker();
        int x=sc.nextInt();
        
        while(x<6 && x>0)
        {
            if(x==1)
            {
                bc.carBalance();
                break;
            }
            if(x==2)
            {
                bc.bikeBalance();
                break;
            }
            if(x==3)
            {
                bc.busBalance();
                break;
            }
            if(x==4)
            {
                bc.truckBalance();
                break;
            }
        }
        System.out.println("Press any key to continue..");
        sc.nextLine();
        sc.nextLine();
        ChooseOption c=new ChooseOption();
        c.optionChoose();
        
    }
}
