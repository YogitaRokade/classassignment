package multithreading;

public class Test extends Thread {
	Test(String name)
	{
		super(name);
	}
 public void run()
 {
	 System.out.println("Thread is running!!"+Thread.currentThread().getName());
 }
 
 public static void main(String []args)
 {
	 Test t1=new Test("Test thread-1"); //new state
	 t1.start();//runnable state
	 
	 Test t2=new Test("Test thread-2"); //new state
	 t2.start();
 }
}
