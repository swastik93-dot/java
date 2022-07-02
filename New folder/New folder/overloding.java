import java.lang.*;
 
class overloding
{
        public static void main(String ar[])
    {
        Demo obj = new Demo();
        int ret = 0;
        ret = obj.Add(10,20);
        System.out.println(ret);
        ret = obj.Add(10,20,30);
        System.out.println(ret);
        ret = obj.Add(10,20,30,40);
        System.out.println(ret);
    }

    }

 class Demo
 {
     //paramatrized constructor
  public int Add(int i,int j)
{
    return i + j;

}
 //paramatrized constructor
 public int Add(int i,int j , int k)
 {
     return i + j + k;
 }
  //paramatrized constructor
public int Add(int i,int j , int k,int z)
 {
     return i + j + k + z;
 }
 }   
