
package demosingleton;

class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    
    private CoffeeMachine()
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    static  CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
}
public class DemoSingleTon {

    
    public static void main(String[] args) {
        CoffeeMachine c1=CoffeeMachine.getInstance();
        CoffeeMachine c2=CoffeeMachine.getInstance();
        CoffeeMachine c3=CoffeeMachine.getInstance();
        System.out.println(c1+"\n"+c2+"\n"+c3);
        if(c1==c2 && c2==c3)
            System.out.println("Same");
    }
    
}
