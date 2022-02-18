/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp.series;
import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class GPSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,d and n");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*d;
        }
        // TODO code application logic here
    }
    
}
