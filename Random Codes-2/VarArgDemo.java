
package varargdemo;


public class VarArgDemo {

   static void nameList(int x,String...A)
   {
       for(int i=0;i<A.length;i++)
       {
           System.out.println(x+"."+A[i]); 
           x++;
       }
   }
    public static void main(String[] args) {
        nameList(4,"Sohan","Rohan","Tanjim","Dipto","Leeon");
    }
    
}
