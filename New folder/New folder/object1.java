//tostring method


import java.lang.*;

class object1
{
    public static void main(String a[])
    {
        Employee eobj = new Employee("Piyush",10000);
        System.out.println(eobj.toString());
    }
}

class Employee   //class employee extends object
{
    public String name;
    public int Salary;

    public Employee(String str,int no)
    {
        this.name = str;
        this.Salary = no;

    }
    public String toString()
{
    return "Salary "+Salary ;
}
}

