#include<stdio.h>

void Display(int No)
{
   int i = 1;
   while(i <= No)
   {
     printf("#\t");
     i++;
   }
}
//Recursion
void DisplayR(int No)
{
   static int i = 1;
   if(i <= No)
   {
     printf("#\n");
     i++;
   DisplayR(No);//Recursive call                -calling funcion form same function itself
   }
}
int main()
{
   
   int Value = 3;
  //Display(4);
  DisplayR(3);

    return 0;
}