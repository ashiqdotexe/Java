/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.driven.problem;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class MenuDrivenProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ADD");
        System.out.println("SUB");
        
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        String str="";
        System.out.println("Enter an option in words: ");
        str=sc.nextLine();
        str=str.toUpperCase();
        switch(str)
        {
            case "ADD": System.out.println("Sum is "+(x+y));
            break;
            case "SUB": System.out.println("Substract is "+(x-y));
        }
        
        // TODO code application logic here
    }
    
}
