
package parkinglotproject;

import java.util.Scanner;

class VehiclesArrive
{
    int arr=10;
    public void vehiclesPark()
    {
        System.out.println("Type of vehicle- ");
        System.out.println("1. Car (50 taka/car)");
        System.out.println("2. Bike (20 taka/bike(40% off))");
        System.out.println("3. Bus (120 taka/bus)");
        System.out.println("4. Truck(100 taka/truck)");
        System.out.println("5. Back");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        try
        {
        while(x<5 && x>0)
        {
            if(x==1)
           {
            Car c=new Car();
           c.parkDone();
           
            break;
            }
            if(x==2)
            {
                Bike b=new Bike();
                b.parkDone();
                break;
            }
            if(x==3)
            {
                Bus bu=new Bus();
                bu.parkDone();
            }
            if(x==4)
            {
                Truck t=new Truck();
                t.parkDone();
            }
        }
        }
        catch(Exception ex)
        {
            System.out.println("Invalid option");
        }
         ChooseOption c=new ChooseOption();
         c.optionChoose();
    }
   
        
}
