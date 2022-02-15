
package parkinglotproject;

import java.util.InputMismatchException;
import java.util.Scanner;
import parkinglotproject.VehicleParked.CarParked;


class ChooseOption
{
    Scanner sc=new Scanner(System.in);
    public void optionChoose()
    {
        System.out.println("Please choose your option");
        System.out.println("1>> Arrival of vehicles");
        System.out.println("2>> Total Number of vehicles parked");
        System.out.println("3>> Check Balance");
        System.out.println("4>>Exit");
        int x=sc.nextInt();
      try
      {
        while(x<4 && x>0)
      {
      if(x==1)
      {
          VehiclesArrive v=new VehiclesArrive();
          v.vehiclesPark();
          break;
      }
      if(x==2)
      {
          VehicleParkChoosing vch=new VehicleParkChoosing();
          vch.choosingOption();
          break;
      }
      if(x==3)
      {
          BalanceChoosing bc=new BalanceChoosing();
          bc.balanceChoose();
          break;
      }
    }
      }
      catch(InputMismatchException e)
      {
          System.out.println("!!!!Invalid option!!!");
      }
        System.out.println("=========\n          Thank you | Application has terminated\n                                                    ==========");
    
}
}