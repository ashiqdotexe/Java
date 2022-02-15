
package parkinglotproject;


public class BalanceChecker extends VehicleParked {
    
        Car c=new Car();
        Bike b=new Bike();
        Bus bu=new Bus();
        Truck t=new Truck();
        
        public void carBalance()
        {
            System.out.println("Balance of car parking: "+c.parkBalance());
        }
        public void bikeBalance()
        {
            System.out.println("Balance of bike parking: "+b.parkBalance());
        }
        public void busBalance()
        {
            System.out.println("Balance of bus parking: "+bu.parkBalance());
        }
        public void truckBalance()
        {
            System.out.println("Balance of truck is: "+t.parkBalance());
        }
        public void totalBalance()
        {
            System.out.println("Total Balance is: "+c.parkBalance()+b.parkBalance()+bu.parkBalance()+t.parkBalance());
        }
    
    
}
