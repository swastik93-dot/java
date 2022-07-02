//code based on prioritys of thread
import java.lang.*;

class Marvellous extends Thread//fakta ithe change kala implement runnable chya awaji extends runnable ghetala tri output same yate
{
public void run()
{
    System.out.println("Inside thread :"+Thread.currentThread().getName());
    System.out.println(" thread priority:"+Thread.currentThread().getPriority());

}
}//konta threaD kadhi run hoil apan nahi sangushakat
class Mythread7
{
    public static void main(String arg[])
    {
         System.out.println("Main thread priority:"+Thread.currentThread().getPriority());

       Marvellous mobj1 = new Marvellous();
       Thread t1 = new Thread(mobj1,"First");

       Marvellous mobj2 = new Marvellous();
       Thread t2 = new Thread(mobj2,"Second");

       t1.start();
       t2.start();

    }
}