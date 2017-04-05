import java.util.Scanner;
{
class greatestarray
{
public static void main(String ar[])
{
int i,l,j;
Scanner sc=new Scanner(System.in);
int array[]=new int[10];
System.out.println("ënter the length of array");
l=sc.nextInt();
System.out.println("enter your array");
for(i=0;i<l;i++)
{
array[i]=sc.nextInt();
} 
System.out.println("result is");

for(i=0;i<l;i++)
{
System.out.println(array[i]);
}
for(j=0;j<=l;j++)
{
	

if(array[j]>array[j+1])
{
	array[j+1]=array[j];
	
}


}
for(j=0;j<l;j++)
{
	System.out.println("greatest no is"+array[j]);
}
}
}