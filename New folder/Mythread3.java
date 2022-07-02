
//don prakar ni multhitread karushakto
//extends thread
//implement runnable
//kahi jri lihale tri main function same rahate
import java.lang.*;

class Marvellous implements Runnable//fakta ithe change kala extends thread chya awaji implement runnable ghetala tri output same yate
{
public void run()
{
    System.out.println("Inside thread :"+Thread.currentThread().getName());

}
}//konta threaD kadhi run hoil apan nahi sangushakat
class Mythread3
{
    public static void main(String arg[])
    {
       Marvellous mobj1 = new Marvellous();
       Thread t1 = new Thread(mobj1,"First");

       Marvellous mobj2 = new Marvellous();
       Thread t2 = new Thread(mobj2,"Second");

       t1.start();//start nahi tri call hote te internally
       t2.start();

    }
} //jr class alrady extend karat asel thread la so ty mule impliment runnable ha ghetat