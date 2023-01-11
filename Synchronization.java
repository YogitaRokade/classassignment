package multithreading;
//shared resource
class Product1
{
 void PrintProduct1(int n) //synchronize
	{
		System.out.println("out of synchronization block");
		synchronized(this)
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+n*i);
			
			try
			{
				Thread.sleep(500);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}//loop
		
	} //synchronization block
		
		System.out.println("end of method");
	}
} //class

public class Synchronization {
	public static void main(String []args)
	{
		//shared resource
		Product1 obj=new Product1();
		
		//Thread t1=
				new Thread()
		{
			public void run()
			{
				obj.PrintProduct1(5);
			}
		}.start();
		
		//Thread t2=
				new Thread()
		{
			public void run()
			{
				obj.PrintProduct1(200);
			}
		}.start();
				
				
			//	t1.start();
			//	t2.start();
				
	}

}
