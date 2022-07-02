import java.lang.*;

class virtual
{
 public static void main(String arr[])
 {
  // Base bobj = new Base();           //NO casting 
  // Derived dobj = new Derived();  //NO casting


  Base obj = new Derived();     //upcasting //Base *bp = new Derived()
  // Derived obj2 = new Base();      ///Downcasting
  
     obj.fun();  //Derived fun
     obj.gun();  //Base gun
     obj.sun();  //Derived sun 
  // obj.run();     // Base kadhe run nahi ty mule error
  
  
   }
  
}
class Base
{
   public int i,j;
public void fun()        //defination
   {
       System.out.println("Base fun");
   }
public void gun()       //defination
   {
       System.out.println("Base gun");
   }
public void sun()      //defination
   {
       System.out.println("Base sun");
   }
}

class Derived extends Base
{
    public int x,y;
    public void fun()       //Overriding
    {
        System.out.println("Derived fun");
    }
     public void gun()         //Overriding
    {
        System.out.println("Derived gun");
    }
     public void run()           //Overriding
    {
        System.out.println("Derived run");
    }

    
}

