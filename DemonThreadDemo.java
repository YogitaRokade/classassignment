package multithreading;

public class DemonThreadDemo extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("The thread is demon thread");
			
		}
		else 
		{
			System.out.println("The thread is user thread");
		}
	}
	public static void main(String args[])
	{
		DemonThreadDemo t1= new DemonThreadDemo();
		DemonThreadDemo t2= new DemonThreadDemo();
		t1.setDaemon(true);
        t2.setDaemon(false);
        t1.start();
        t2.start();
	}

}
