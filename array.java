import java.util.Scanner;
class array
{
public static void main(String ar[])
{
int i,l,j,temp;
Scanner sc=new Scanner(System.in);

System.out.println("ënter the length of array");
l=sc.nextInt();
int a[]=new int[l];
System.out.println("enter your array");
for(i=0;i<l;i++)
{
a[i]=sc.nextInt();
} 
System.out.println("result is");

for(i=0;i<l;i++)
{
System.out.println(a[i]);
}
for(i=0;i<l;i++)
	for(j=0;j<l;j++)
{
	if(a[i]>a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}

System.out.println("increasing order is");
for(i=0;i<l;i++)
{
	System.out.println(a[i]);
}
}
}