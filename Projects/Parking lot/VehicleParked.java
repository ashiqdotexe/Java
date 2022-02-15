
package parkinglotproject;


public class VehicleParked {
    //for cars
    class CarParked extends Car
    {
        void carParked()
        {
            Car c=new Car();
            c.totalParked();
        }
    }
    void displayCarParked()
    {
        CarParked cp=new CarParked();
        cp.carParked();
    }
    //for car ends
    //for bikes
    class BikeParked extends Bike
    {
        void bikeParked()
        {
            Bike b=new Bike();
            b.totalParked();
        }
    }
    void displayBikeParked()
    {
        BikeParked b= new BikeParked();
        b.bikeParked();
         
    }
    //for bike ends
    //for bus
      class BusParked extends Bus
    {
        void busParked()
        {
            Bus bu=new Bus();
            bu.totalParked();
        }
    }
    void displayBusParked()
    {
        BusParked bu= new BusParked();
        bu.busParked(); 
    }
    //for bus ends
    //for truck
        class TruckParked extends Truck
    {
        void truckParked()
        {
            Truck t=new Truck();
            t.totalParked();
        }
    }
    void displayTrcukParked()
    {
        TruckParked t= new TruckParked();
        t.truckParked(); 
    }
    //for truck ends
    class TotalParked
    {
        class CarParked extends Car
    {
        int carParked()
        {
            Car c=new Car();
            return c.getNum();
        }
    }
        class BikeParked extends Bike
    {
        int bikeParked()
        {
            Bike b=new Bike();
            return b.getNum();
        }
    }
              class BusParked extends Bus
    {
        int busParked()
        {
            Bus bu=new Bus();
            return bu.getNum();
        }
    }
          class TruckParked extends Truck
    {
        int truckParked()
        {
            Truck t=new Truck();
            return t.getNum();
        }
    }
        int totalParked()
        {
            CarParked cp=new CarParked();
            BikeParked b=new BikeParked();
            BusParked bu=new BusParked();
            TruckParked t=new TruckParked();
            return cp.carParked()+b.bikeParked()+bu.busParked()+t.truckParked();
        }
        
    }
}
