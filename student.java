import java.util.Scanner;

class student
{
public static void main(String ar[])
{
int roll;
int  maths,sci;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter ur name");

String ab=sc.next();//string ab=sc.nextLine();


System.out.println("enter ur name"+ab);
System.out.println("enter your roll no");
roll=sc.nextInt();
System.out.println(" your roll no "+roll);



System.out.println("enter ur section");
char a=sc.next().charAt(0);
System.out.println(a);
System.out.println("enter marks of maths");
maths=sc.nextInt();

System.out.println(" marks of maths"+maths);

System.out.println("enter marks of science");
sci=sc.nextInt();

System.out.println("average is");
avg=(maths+sci)/2;

System.out.println("average is"+avg);
}

}