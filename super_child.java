// super
class super_parent
{
int i=200;
}
class super_child extends super_parent
{
int i=100;
public static void main(String ar[])
{
super_child obj=new super_child();


obj.display();

}
void display()
{
	System.out.println("result is"+i);
System.out.println("result is"+super.i); // super is used to use the value of parent class
}
}