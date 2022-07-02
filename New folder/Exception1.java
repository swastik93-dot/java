import java.util.*; //jehva scanner lagto ty vales util vapartT

class Exception1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int no1 = sobj.nextInt();

        System.out.println("Please enter the second number:");
        int no2 = sobj.nextInt();
    
      int ans = no1/no2;   //ithe code fatel so ti solve karyla exception2.java refer kr
      System.out.println("Division is :"+ans);
      sobj.close();

    }
}