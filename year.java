import java.util.Scanner;
class year
{
Scanner sc=new Scanner(System.in);
 static int yr,mnt,dy,wk;
static void getdata()
{
System.out.println("enter the number of days");
dy=sc.nextInt();
}
static void calculation()
{
{
if(dy>7)
{
wk=dy%7;
}
}
static void putdata()
{
	System.out.print(dy);
	System.out.print(wk);
}
}
  public static void main(String ar[])
 {
	 getdata();
	 calculation();
	 putdata();
 }
 }
 