//it include the concept of encasulation  and concept of class
import java.lang.*;

class marvellous
{
 public static void main(String arr[])

{// class  obj  method
    System.out.println("Inside main");
    Demo obj = new Demo();
    obj.fun();   //fun(obj);
    obj.gun();   //gun(obj);
    System.out.println(obj.i);

      Demo objx = new Demo();
    objx.fun();   //fun(obj);
    5objx.gun();   //gun(obj);
    System.out.println(obj.i);

 }
}



class Demo
{
    
 public int i;
 public int j;

//default constructor
 public Demo()
 {
     this.i = 0;
     this.j = 0;
 }
 //paramatrised constructor
 public Demo(int x,int y)
 {
     this.i = x;
     this.j = y;
 }
 public void fun()
 {
     System.out.println("inside fun");
 } 

public void gun()
 {
     System.out.println("inside gun");
 }
}

