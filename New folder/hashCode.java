import java.lang.*;



class hashCode
{
     public static void main(String a[])throws Exception
     {
         String str1 = "Marvellous";
         String str2 = "Marvellous";
         String str3 = "Marvellous";
         Demo dobj = new Demo();

         System.out.println("HashCode of str1:"+str1.hashCode());
         System.out.println("HashCode of str2:"+str2.hashCode());
         System.out.println("HashCode of str3:"+str3.hashCode());
         System.out.println("HashCode of dobj:"+dobj.hashCode());

     }
}
class Demo
{}
