/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglotproject;

import java.util.Scanner;


public class Truck extends constantVariable implements constantMethod {
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
        System.out.println("How many truck do you wanna park: ");
         n=sc.nextInt();
         
         
        temp=temp-n;
        System.out.println("Truck has been parked");
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
          int balance=100;
        balance=n*balance;
        return balance;
    }

    @Override
    public void totalParked() {
        System.out.println(n+" trucks has parked here");
    }
    
}
