import java.lang.*;
import java.io.*; 

class Input1 
{//                                         he khalche throws IOException ghatale karan apan compiler la sangat ahea input neat ghe exception yail
    public static void main(String arr[])throws IOException
    {

    InputStreamReader iobj = new InputStreamReader(System.in);
    BufferedReader bobj = new BufferedReader(iobj);

    System.out.println("ERnter your name:");
    String name = bobj.readLine();

    System.out.println("Your name is:"+name);

    }
}