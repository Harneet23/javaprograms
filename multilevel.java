import java.util.Scanner;
class mother
{
Scanner sc=new Scanner(System.in);
void getmother()
{
System.out.println("Enter the name of Mother");
String mo=sc.next();
}
void putmother()
{
System.out.println("Name of the Mother is "+mo);
}
}
class father
{
void getfather()
{
System.out.println("enter the name of Father ");
String fa=sc.next();
}
void putfather()
{
System.out.println("Name of the father is "+fa);
}
}
class multilevel extends mother , father
{

public static void main(String ar[])
{
child obj=new child();
obj.getmother();
obj.getfather();
obj.putmother();
obj.putfather();
}
}
