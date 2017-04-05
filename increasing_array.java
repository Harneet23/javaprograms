import java.util.Scanner;
class increasing_array
{
public static void main(String ar[])
{
int l,temp,i;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
l=sc.nextInt();
System.out.println("enter the values");
for( i=0;i<l;i++)
{
a[i]=sc.nextInt();
}
System.out.println("entered values are");
for(i=0;i<l;i++)
{
System.out.println(a[i]);
}
for(int j=0;j<l-1;j++)
for(i=0;i<l-1;i++)	
{
if(a[i]<a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;

}

}

System.out.println("inceasing order is");
for(i=0;i<l;i++)
{
System.out.println(a[i]);
}
}
}