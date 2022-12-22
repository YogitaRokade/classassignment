package multithreading;

public class ThreadPriority {
	ThreadPriority(String name)
	{
		super();
	}
	public void run()
	{
		System.out.println("Thread is running"+Thread.currentThread().getName()
				+""+Thread.currentThread().getPriority());
	}
	
	 public static void main(String []args)
	 {
		 Test t1=new Test("Test Thread-1");
		 //new state
		 Test t2=new Test("Test Thread-2");
		 Test t3=new Test("Test Thread-3");
		 Test t4=new Test("Test Thread-4");
		 
		 t1.setPriority(Thread.MAX_PRIORITY);//10
		 t2.setPriority(Thread.MIN_PRIORITY);//1
		 t3.setPriority(Thread.NORM_PRIORITY);//5
		t4.setPriority(7);//7
		
		t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
	 }

}
