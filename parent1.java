class child
{
public void method1()
{
	method2();
}

class parent1 extends child
{
public void method2()
{
method1();
}
}

public static void main(String ar[])
{
parent1 obj= new parent1();
obj.child();

}
}
