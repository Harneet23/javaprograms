import java.util.Scanner;
class  parent
{
Scanner sc=new Scanner(System.in);
int a,b,ad;
void getdata()
{

System.out.println("enter the first value");
a=sc.nextInt();
System.out.println("enter the Second value");
b=sc.nextInt();
}
void calcuulation()
{
ad=a+b;
}
void showdata()
{
System.out.println("addition is"+ad);
}
}
class child extends parent
{

void calculation1()
{
ad=a*b;
}
void showdata1()
{
System.out.println("multiplication is"+ad);

}

public static void main(String ar[])
{
	
	child obj=new child();

obj.getdata();
obj.calcuulation();
obj.showdata();
obj.calculation1();
obj.showdata1();
}
}
