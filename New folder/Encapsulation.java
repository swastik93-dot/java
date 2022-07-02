import java.lang.*;

class Encapsulation
{
    public static void main(String str[])
    {
        System.out.println("Inside main");

        Demo obj = new Demo();

        obj.gun();
        obj.fun();

        System.out.println(obj.i);


        obj.gun();
        obj.fun();

        System.out.println(obj.i);


    }

}
class Demo
{
   public int i;
   public int j;

 public Demo()
  {
      this.i = 5;
      this.j = 10;

      int add = 0;
      add = i + j;

  }
  public Demo(int x, int y)
  {  int add = 0;
      this.i =x;
      this.j = y;

    
    
  }
  public void fun()
  {   
      System.out.println("inside fun");
     
  }
  public void gun()
  {
      System.out.println("Inside gun");

  }
}