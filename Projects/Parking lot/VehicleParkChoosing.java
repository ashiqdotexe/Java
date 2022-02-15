
package parkinglotproject;

import java.util.Scanner;

public class VehicleParkChoosing extends VehicleParked {
    public void choosingOption()
    {
        
        System.out.println("1. Car parked");
        System.out.println("2. Bike parked");
        System.out.println("3. Bus parked");
        System.out.println("4. Truck Parked");
        System.out.println("5. Back");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose your option: ");
        int x=sc.nextInt();
        while(x<5)
        {
        if(x==1)
        {
            CarParked cp=new CarParked();
            cp.carParked();
            break;
        }
        if(x==2)
        {
            BikeParked b=new BikeParked();
            b.bikeParked();
            break;
        }
        if(x==3)
        {
            BusParked bu=new BusParked();
            bu.busParked();
            break;
        }
        if(x==4)
        {
            TruckParked t=new TruckParked();
            t.truckParked();
            break;
        }
    }
        ChooseOption c=new ChooseOption();
        c.optionChoose();
            
}
}