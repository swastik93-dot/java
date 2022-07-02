import java.io.*;
class practice
{//   BufferedReader he input string format madhe ghate te jr int,float,double etc madhe convert karyche asel tr rapper class vapartat
    public static void main(String a[])throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the string");
        String str = bobj.readLine();

        System.out.println("Enter the Integer");
        int no = Integer.parseInt(bobj.readLine());


        System.out.println("Enter the Float");
        float f = Float.parseFloat(bobj.readLine());

        
        System.out.println("Enter the Double");
        double d = Double.parseDouble(bobj.readLine());


        System.out.println("Entered String is: "+str);
        System.out.println("Entered integer is: "+no);
        System.out.println("Entered float is: "+f);
        System.out.println("Entered Double is: "+d);




        


    }
}