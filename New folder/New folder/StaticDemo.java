import java.lang.*;

cllass Demo
{
    public int i;
    public int j;
    public static int k;

   //Default constructor
    public Demo()
    {

    }
    //non static behiviour
    public void fun()
    {

    }
    // static behiviour
    public static void gun()
    {
      System.out.println("inside static gun");
    }
}

class StaticDemo
{
  public static void main(string a[]);
  {
      Demo.gun();
      Demo obj;
      obj = new Demo();
  }

}