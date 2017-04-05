import java.util.Scanner;
class two_array
{
public static void main(String ar[])
{
	int i;
	int j;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
System.out.println("enter the length of array");
int l =sc.nextInt();
System.out.println("enter the value of first array");
for(i=0;i<l;i++)
for(j=0;j<l;j++)
{
a[i][j]=sc.nextInt();
}
System.out.println("enter the value of Second array");
for( i=0;i<l;i++)
for( j=0;j<l;j++)
{
b[i][j]=sc.nextInt();
}
System.out.println("addition is");
{
for(i=0;i<l;i++)
for(j=0;j<l;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
System.out.println( c[i][j]);
}


}
}