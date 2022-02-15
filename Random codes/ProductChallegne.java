
package productchallegne;
import java.util.Scanner;
  class Product
  {
      String itemno;
      String name;
      int price;
      int qty;
      
      //Property method>>
      public String getItemno(){
          return itemno;
      }
      public String getName()
      {
          return name;
      }
      public int getPrice()
      {
          return price;
      }
      public int getQuantity()
      {
          return qty;
      }
      //**//
     /* public void setItemno(String i)
      {
          itemno=i;
      }
      public void setName(String nm)
      {
          name=nm;
      }*///ItemNo and Name of product are unique, so there should be only read method.
      public void setPrice(int p)
      {
          price=p;
      }
      public void setQuantity(int q)
      {
          qty=q;
      }
      //<<Property method
      //Constructor>>
      public Product(String itn,String nm)
      {
          itemno=itn;
          name=nm;
      }
      public Product()
      {
          price=0;
          qty=0;
      }
      public Product(int p,int q)
      {
          price=p;
          qty=q;
      }
      //<<Constructor
      
  }
/*public class ProductChallegne {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        System.out.println("Enter the Item number and name of of the product: ");
        p.itemno=sc.nextLine();
        p.name=sc.nextLine();
        
        System.out.println("Product name: "+p.getName()+"\nItem number: "+p.getItemno());
    }
    
}*/
