//Q   accept 2 num  and display add by commandline arg

import java.lang.*;

class Command
{
    public static void main(String Arg[])
    {
 
   System.out.println("First number is:"+Arg[0]);
   System.out.println("Second number is:"+Arg[1]);
  
    int Ans =Integer.parseInt(Arg[0] )+Integer.parseInt(Arg[1]);
    System.out.println("Addation is:"+Ans);
    }
}

//compilation _
   //javac Command.java

//for run_
   //java Command 10 11    //10  11 he ip diley



//Addation =21