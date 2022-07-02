import java.lang.*;
import java.util.*;

class tp
{
   public static void main(String str[])
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Please enter your name");
    String name = sobj.nextLine();

    System.out.println("Enter the age:");
    int age = sobj.nextInt();

    System.out.println("Enter CGPA");
    float CGPA = sobj.nextFloat();

    System.out.println("Your name:"+name);
    System.out.println("Your age:"+age);
    System.out.println("Your CGPA:"+CGPA);

}


}