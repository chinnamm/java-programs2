package Day;
import java.lang.Thread;
class DemoThreadInterface implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("My thread.."+i+" "+Thread.currentThread().getName());
		}
	}
}

class DemoThread extends Thread
{
	public void run()
	{
		super.run();
		System.out.println("My thread..."+currentThread().getName());
	}
}
public class ThreadDemo {

	public static void main(String[] args) 
	{
		DemoThreadInterface demoThreadInterface=new DemoThreadInterface();
		Thread t1=new Thread(demoThreadInterface);
		Thread t2=new Thread(demoThreadInterface);
		t1.setName("t1");
		t2.setName("t2");
		t2.setPriority(10);
		t1.start();
		t2.start();
		

	}

}
