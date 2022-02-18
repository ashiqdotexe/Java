//HM Ashiqur Rahman
//2013941642
package pointline;
class Point
{
   private int x;
   private int y;
   
   public Point()
   {
      this.x = 1;
      this.y = 1;
   }

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX()
   {
      return x;
   }

   public void setX(int x)
   {
      this.x = x;
   }

   public int getY()
   {
      return y;
   }

   public void setY(int y)
   {
      this.y = y;
   }

   @Override
   public String toString()
   {
      return "Point [x=" + x + ", y=" + y + "]";
   }
   
   public double distance(Point point) {
      return Math.sqrt((Math.pow((this.x - point.x) , 2) + Math.pow((this.y - point.y) , 2) ));
   }
   
   
}


