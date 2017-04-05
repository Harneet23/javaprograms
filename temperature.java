import java.util.Scanner;

class temperature
{
public static void main(String ar[])
{
Scanner sc= new Scanner(System.in);

double f,c,t,k;
int a;
System.out.println("Enter ur option");
System.out.println("enter 1 for kelvin");
System.out.println("Enter 2 for celcius");
System.out.println("Enter 3 for ferinite");
a=sc.nextInt();
switch(a)
{
case 1:
{
	System.out.println("enter ur value in kelvin");
	k=sc.nextDouble();
	f=((k-273.15)*9)/5+32;
	System.out.println(" temp in ferinite is:"+f);
	c=(f-32)*5/9;
	System.out.println("temp in celcius is:"+c);
	

break;
}
case 2:
{
	System.out.println("enter ur temp in celcius");
	c=sc.nextDouble();
	f=((c*9)/5)+32;
	System.out.println("temp in ferinite is"+f);
	k=((f-32)*5/9)+273.15;
	System.out.println("temp in kelvin "+k);
	

break;
}
case 3:
{
	System.out.println("enter ur temp in ferinite");
	f=sc.nextDouble();
	c=(f-32)*5/9;
     System.out.println("temp in celcius"+c);
	 k=((f-32)*5/9)+273.15;
	  System.out.println("temp in kelvin"+k);
	 
	 

break;
}
}
}
}
