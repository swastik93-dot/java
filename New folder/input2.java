import java.lang.*;
import java.io.*; 

class Input2 
{//                
    public static void main(String arr[])
    {

    InputStreamReader iobj = new InputStreamReader(System.in);
    BufferedReader bobj = new BufferedReader(iobj);

try{
    System.out.println("ERnter your name:");
    String name = bobj.readLine();
    System.out.println("Your name is:"+name);

    
    System.out.println("ERnter your age:");
int age = Integer.prseInt(bobj.readLine());
System.out.println("Your age is "+age);
}
catch(IOException obj)
{
    System.out.println("Exception occure");
}
finally
{
    //ya madhe memory deallocate keli
    iobj = null;//c,c++ madhe null MACRO hota(capital)
    bobj = null;
}
    }
}