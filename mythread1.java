class A extends Thread
{
public void show()
{
for(int i=0;i<100;i++)
{
System.out.println("I am in class A");

try 
{
	

Thread.sleep(500);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
public void run()
{
	show();
}
}
class B extends Thread
{
public void show1()
{
for(int i=0;i<100;i++)
{
System.out.println("I am in class B");
try
{
Thread.sleep(500);	
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
public void run()
{
	show1();
	
}
}
class mythread1
{
		public static void main(String ar[])
		{
A obj=new A();
obj.show();
//System.out.println("Division is:"+10/0);
B obj1=new B();
obj1.show1();
		}
}