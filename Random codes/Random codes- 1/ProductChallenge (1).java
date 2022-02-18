/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productchallenge;

import java.util.Scanner;


public class ProductChallenge {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        System.out.println("Enter the Item number and name of of the product: ");
        p.itemno=sc.nextLine();
        p.name=sc.nextLine();
        
        System.out.println("Product name: "+p.getName()+"\nItem number: "+p.getItemno());
    }
    
}
