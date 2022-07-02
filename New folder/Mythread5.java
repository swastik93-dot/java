import java.lang.*;


class Mythread5
{
    public static void main(String ar[]) throws Exception 
    {//                                  //khali join method lihali so ithe throws Exception  lihyave lagel
        
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1,"first");//New state
         Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2,"Second");//New state

        t1.start();     //Runnable state
      
        t1.join();//ya vakya ne pahila thread sampla ki mg dusra statr hoto 
      //kam dependent asel trch join method vaparavi
        t2.start();     //Runnable state 
       //Dead state
    }
}

class Demo extends Thread
{
    public void run()        //Running state
    
    {
       for(int i =0; i< 10 ; i++)
       {
           System.out.println("value of i :"+i);
        try{
           Thread.sleep(1000);//ithe sleep takle so output thambat thambat yate
       }             //ithe 1000 kale mahnun op 1 sec ne late run hoil
       catch(Exception obj)
       {}
       }
    }
    }
