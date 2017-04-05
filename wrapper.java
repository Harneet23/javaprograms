//wrapper class
class wrapper
{
public static void main(String ar[])
{
int i=200;
Integer obj=Integer.valueOf(i); //Boxing
Integer obj1=i; // autoboxing
System.out.println("i="+i);
System.out.println("obj="+obj);
System.out.println("obj1="+obj1);
}
}