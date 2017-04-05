import java.util.Scanner;

	class divisible
	{
		public static void main(String ar[])
		{
			Scanner sc=new Scanner(System.in);
			int a;
			float b;
			System.out.println("enter ur value");
			a=sc.nextInt();
			b=a%2;
			System.out.println(b);
			if(b%2==0)
			{
				System.out.println("no will be a power of 2");
			}
			else
			{
				System.out.println("sorry");
			}
		}
	}
 
