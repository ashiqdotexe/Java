
package parkinglotproject;

import java.util.Scanner;

class Car extends constantVariable implements constantMethod 
{
    Scanner sc=new Scanner(System.in);
    int temp=carSpace;
    int n;
    public int getNum()
    {
        return n;
    }
    public void setNum()
    {
        
    }
    
    @Override
    public void parkDone() {
        
         System.out.println("How many car do you wanna park: ");
         n=sc.nextInt();
         
         
        temp=temp-n;
        System.out.println("Car has been parked\n");
        carSpace=temp;
        System.out.println("Parking lot left: "+getCarSpace()+"\n\n\n");
        
        
        
        System.out.println("Press any key to continue..");
        sc.nextLine();
        sc.nextLine();
        
         ChooseOption c=new  ChooseOption();
         c.optionChoose();
    }
   

    @Override
    public int parkBalance() {
        int balance=50;
        balance=balance*n;
        return balance;
        
    }

    @Override
    public void totalParked() {
        System.out.println(n+" cars has parked here");
    }

}
