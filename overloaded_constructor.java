import java.util.Scanner;
class overloaded_constructor
{
String emp_name;
int emp_id,emp_salary;
overloaded_constructor(int id,String name)
{
emp_name=name;
emp_id= id ;
}
overloaded_constructor(int id,String name,int salary)
{
emp_name=name;
emp_id= id ;
emp_salary=salary;

}
void putdata()
{
System.out.println(emp_id+" "+emp_name+emp_salary);
} 
public static void main(String ar[])
{
overloaded_constructor obj=new overloaded_constructor(420," bio");
obj.putdata();
overloaded_constructor obj2=new overloaded_constructor(876,"dude", 10000);
obj2.putdata();

}
}