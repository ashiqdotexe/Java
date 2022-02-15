/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountonproduct;

/**
 *
 * @author ashiq
 */
public class DiscountOnProduct {

    static double sum(double...A)
    {
        double sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
            
        }
        if(sum<500&& sum>400)return sum*0.15;
            else if(sum>700)return sum*.30;
            else if(sum>1000)return sum*.50;
            else return 0;
        
    }
    public static void main(String[] args) {
        System.out.println(sum(250,100));
    }
    
}
