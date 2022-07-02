import java.lang.*;
import java.io.*; 

class Stringxxxxx
{             
    public static void main(String a[])
    {
       
        String str1 = "Hello";//100
        String str2 =  "Hello";//100
        String str3 =  new String("Hello");//200

        if(str1 == str2)  //if(100 ==200)
        {
           System.out.println("String are same");

        }
        else
        {
           System.out.println("String not are same");
        }
        if(str1.equals(str3))
        {
            System.out.println("Strings are different");
        }
        else
        {
             System.out.println("String are different");
        }
       
    }
}