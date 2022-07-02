import java.lang.*;
import java.util.*; //jehva scanner lagto ty vales util vapartT

class Exception3
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40,50};//ya madhe new keyword nahi tari memory allocated at heap
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter theindex");
        int index = sobj.nextInt();
       try
     {
              
        System.out.println("Element at that index is:"+Arr[index]);
      
    }
    catch(Exception obj)//generic catch
    {
        System.out.println(obj);
    }
//Ha code ardha rahila ahea/............

}
}