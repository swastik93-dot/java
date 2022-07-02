import java.lang.*;

class final1
{ public static void main(String arg[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);
        Demo obj2 = new Demo(11,21); 
        obj2.fun();
        System.out.println(obj2.i);//i chi value adhi 11 mg 1 ni vadhli so 12
        System.out.println(obj2.j);
        System.out.println(obj2.k);
    }
}
class Demo
{
    public int i;
    public final int j = 20;
    public final int k;  //final is like constant in c++

    //Default constructor
    public Demo()
    {
        this.i = 10;
        this.k = 30;
    }
 
 //paramatrised constructor
    public Demo(int i, int k)
    {
        this.i= i;
        this.k = k;
    }

    public void fun()
    {
        i++;            // A
//        j++;          NA
//        k++;          NA
    }
}

