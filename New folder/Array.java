//ya program madhe foreach loop pn vaparla ahea
import java.lang.*;

class Array
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int arr[] = new int[5];
        

        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        arr[4] =50;

        System.out.println ("size of array:"+arr.length);
        System.out.println("Data by for loop");


        for(iCnt = 0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
        iCnt = 0;

        System.out.println("Data by While loop");
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("Data by for each loop");
        for(int no:arr)//no la itech define ani declare kale
        {
            System.out.println(no);
        }
    }
}