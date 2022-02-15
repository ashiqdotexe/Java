/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author ashiq
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       
       int count=0;
       
       while(x-->0)
       {
           int ti=sc.nextInt();
           if(ti%y==0){
               
               count++;
       }
       }
        System.out.println(count);
    }
    
}
