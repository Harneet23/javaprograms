import java.util.Scanner;
class employee1
{
	Scanner sc=new Scanner(System.in);
int emp_id;
String emp_name;
void getdata()
{
System.out.println("enter the name");
emp_name=sc.next();
System.out.println("enter the id");
emp_id=sc.nextInt();
}
void showdata()
{
System.out.println(emp_name);
System.out.println(emp_id);
}
public static void main(String ar[])
{
new employee1().getdata();
new employee1().showdata();
}
}