
package parkinglotproject;

import java.util.Scanner;


public class Bus extends constantVariable implements constantMethod{

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
        System.out.println("How many bus do you wanna park: ");
         n=sc.nextInt();
         
         
        temp=temp-n;
        System.out.println("Bus has been parked");
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
         int balance=120;
        balance=n*balance;
        return balance;
    }

    @Override
    public void totalParked() {
       System.out.println(n+" buses has parked here");
    }
    
}
