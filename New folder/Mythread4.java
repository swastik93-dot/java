import java.lang.*;

class Mythread4
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
}
class Marvellous implements Runnable//fakta ithe change kala extends thread chya awaji implement runnable ghetala tri output same yate
{
public void run()
{
    System.out.println("Inside thread :"+Thread.currentThread().getName());

   for(int i = 0; i<= 1000 ; i++)
   {
       System.out.println("Thread shaduled: "+Thread.currentThread().getName());
   }
}
}//konta threaD kadhi run hoil apan nahi sangushakat



//output:  second la aani 1st la vagle vagle time contum milel konala kiti te apan nahi predict karu shakat