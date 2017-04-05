//extending thread class
class mythread extends Thread
{
public void run()
{
System.out.println("I am a thread");
}
public static void main(String ar[])
{
mythread t=new mythread();
t.start();
}
}