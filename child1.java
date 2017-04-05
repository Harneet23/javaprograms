import java.util.Scanner;
interface father
{
 public void getfather();

 public void putfather();
}
interface mother
{
 public void getfather();

public void putfather();
}
class child1 implements father,mother  //obj can not be made in interface because interface provide abstraction

{
public void getfather()
{
	System.out.println("name");
}
public void putfather()
{
	System.out.println("name");
}
public static void main(String ar[])
{
child1 obj=new child1();
obj.getfather();
obj.putfather();
}
}