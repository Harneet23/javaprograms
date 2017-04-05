// by implementing runnable interface
class parent
{
	public void display()
	{
		
		System.out.println("Hello");
		
	}
	}
class multi extends parent implements Runnable 
{
	
	public void run()
	{
		System.out.println("Basra");
	}

	
	public static void main(String ar[])
	{
		multi obj=new multi();
		Thread t= new Thread(obj);
		t.start();
		obj.display();
	}
} 