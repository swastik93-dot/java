//interferance and interferance1 both file are same
//error yt ahea
import java.lang.*;

interface Circle 
{
    float PI = 3.14f;
    
    float CalculateArea(float Radious);
    float CalculateCircumferance(float Radious);

}
class Area implements Circle
{
  public float CalculateArea(float Radious);
   {
       return (PI * Radious * Radious);
   }
  public float CalculateCircumferance(float Radious);
  {
      return(2 * PI * Radious);
  }
}
 class interface 
{
 public static void main(String arr[])

    {
        Area obj = new Area();
        float fRet = 0.0f;

        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is :"+fRet);

        fRet = obj.CalculateCircumferanc(10.5f);
        System.out.println("Circumferanc is :"+fRet);
        
    }

}
