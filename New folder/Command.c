//commandline in c
//  command line mule input deta yate

#include<stdio.h>
#include<stdlib.h>

int main(int argc, char*argv[])
{
    int ans = 0;

    printf("Name of Executable is: %s",argv[0]);

printf("Nuimber of command line arguments are %d,\n");
  
 ans = atoi(argv[1]) + atoi(argv[2]);

 printf("Addation is: %d\n",ans);
    return 0;
}

//compile    Command.c -o myexe
//run         myexe 10 11

//output:  21