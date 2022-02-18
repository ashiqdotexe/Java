
package demo2;
class Phone
{
    void call()
    {
        System.out.println("Calling phone");
    }
    void msg()
    {
        System.out.println("Sending msg");
    }
}
interface Camera
{
    void click();
    void record();
    default void editing()
    {
        
    }
}
interface musicPlayer
{
  void play();
  void stop();
  
}

class Smartphone extends Phone implements Camera,musicPlayer
{
    void videoCall()
    {
        System.out.println("Video Call");
    }
    void Chatting()
    {
        System.out.println("Chatting");
    }
    @Override
    public void click()
    {
        System.out.println("Clicked");
    }
    @Override
    public void record()
    {
        System.out.println("Recorded");
    }
    @Override
    public void play()
    {
        System.out.println("Music played");
    }
    @Override
    public void stop()
    {
        System.out.println("Music stopped");
    }
    public void callRecord()
    {
        System.out.println("Call recording");
    }
}
public class Demo2 {

    
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        Phone p=s;
        Camera c=s;
        musicPlayer m=s;
        m.play();
        m.stop();
    }
    
}
