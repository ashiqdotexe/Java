
package parkinglotproject;

import java.util.Scanner;


public class Bike extends constantVariable implements constantMethod {
    Scanner sc=new Scanner(System.in);
    int n;
    int temp=carSpace;
     public int getNum()
    {
        return n;
    }
    public void setNum()
    {
        
    }

    @Override
    public void parkDone() {
        System.out.println("How many bike do you wanna park: ");
         n=sc.nextInt();
         
         
        temp=temp-n;
        System.out.println("Bike has been parked");
        carSpace=temp;
        System.out.println("Parking lot left: "+getCarSpace());
         System.out.println("Press any key to continue..");
        sc.nextLine();
        sc.nextLine();
         ChooseOption c=new  ChooseOption();
         c.optionChoose();
    }

    @Override
    public int parkBalance() {
        int balance=20;
        balance=n*balance*(40/100);
        return balance;
    }

    @Override
    public void totalParked() {
        System.out.println(n+" bikes has parked here");
    }
    
}
