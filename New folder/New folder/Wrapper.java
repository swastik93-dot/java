import java.lang.*;
import java.io.*; 

class Wrapper
{//                
    public static void main(String arr[])throws IOException
    {
        int no = 11;

        Integer iobj = new Integer(11);

        int i = iobj;      //Unboxing          shirt bag madhun kadhne

        Integer iobj2 = no;   //Boxing         shirt bag madhe takne


        System.out.println(no);
        System.out.println(iobj);
        System.out.println(iobj2);
        System.out.println(i);

    }
}
