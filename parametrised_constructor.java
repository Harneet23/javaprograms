import java.util.Scanner;
class parametrised_constructor
{
String emp_name;
int emp_id;
parametrised_constructor(int id,String name)
{
emp_name=name;
emp_id= id ;
}
void putdata()
{
System.out.println(emp_id+" "+emp_name);
} 
public static void main(String ar[])
{
parametrised_constructor obj=new parametrised_constructor(420,"bio");
obj.putdata();
}
}