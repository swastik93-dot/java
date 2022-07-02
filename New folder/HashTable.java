import java.lang.*;
import java.util.*;
class HashTable
{   public static void main(String arg[])
    {
        //integer is key
        //String is value
        Hashtable <Integer, String>obj = new Hashtable<Integer,String>();
 
        obj.put(11,"Amit");
        obj.put(21,"piyush");
        obj.put(22,"Mayur");
        obj.put(30,"Sagar");
        obj.put(34,"Dinnesh");

        System.out.println(obj.get(30));

         System.out.println("Data from hash table");
         Enumeration eobj = obj.keys();//is like ittration

         while(eobj.hasMoreElements())
         {
              
            System.out.println(eobj.nextElement());

         }
    }
}