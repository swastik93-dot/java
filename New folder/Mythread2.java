//don prakare ni multhitread karushakto
//extends thread
//implement runnable  
import java.lang.*;

class Marvellous extends Thread//fakta ithe change kala implement runnable chya awaji extends runnable ghetala tri output same yate
{
public void run()
{
    System.out.println("Inside thread :"+Thread.currentThread().getName());

}
}//konta threaD kadhi run hoil apan nahi sangushakat
class Mythread2
{
    public static void main(String arg[])
    {
       Marvellous mobj1 = new Marvellous();
       Thread t1 = new Thread(mobj1,"First");

       Marvellous mobj2 = new Marvellous();
       Thread t2 = new Thread(mobj2,"Second");

       t1.start();
       t2.start();

    }
}