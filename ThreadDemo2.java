package multithreading;

public class ThreadDemo2 implements Runnable  {
@Override	
public void run()
{
	System.out.println("Creating thread using runnable interface "
   +Thread.currentThread().getName());
}
	public static void main(String[] args) {
		
		ThreadDemo2 demo2=new ThreadDemo2();
		Thread t1=new Thread(demo2);
		t1.setName("thread 1");
		t1.start();
		
		Thread t2=new Thread(new ThreadDemo2(),"Thread 2");
		t2.start();
	}

}
