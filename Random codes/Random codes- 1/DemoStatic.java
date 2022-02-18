
package demostatic;
class Honda
{
    static int price=20;
    int a,b;
    
    static class PriceOfHonda
    {
        static int onRoadPrice(String name)
        {
            switch(name)
            {
                case "delhi":
                    return price+price*10;
                case "mumbai": return price+price*20;
            }
            return price;
        }
    }
}

public class DemoStatic {

    
    public static void main(String[] args) {
        System.out.println(Honda.PriceOfHonda.onRoadPrice("mumbai"));
    }
    
}
