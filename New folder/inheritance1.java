import java.lang.*;

class inheritance1
{
static
{
      System.out.println("inside stack block");

}
    public static void main(String arr[])
{

     System.out.println("inside main");
     Derived dobj = new Derived();
    dobj.fun();
     dobj.fun(11);
    dobj.gun();
     dobj.sun();
     
}
}

class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("inside base constructor");
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
    public void fun(int x)
{
    System.out.println("inside base fun with integer argument");
}
public void gun()
{
    System.out.println("inside base gun ");
}

}
class Derived extends Base  //derived class madhe extend vaprun base class la inherit ka;le
{
 public int x;
 public int y;

 public Derived()
 {
     System.out.println("Inside derived constructor");
 }

 public void sun()
 {
     System.out.println("Inside derived sun"); 
 }

}
