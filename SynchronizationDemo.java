package multithreading;
//shared resource
class Product
{
	synchronized void PrintProduct(int n) //synchronize
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+""+n*i);
			
			try
			{
				Thread.sleep(500);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}//loop
		
	} //method
	
} //class

//first thread

class FirstThread extends Thread
{
	Product p;
	FirstThread(Product p)
	{
		this.p=p;
	}
	public void run()
	{
		p.PrintProduct(5);
	}
}
class SecondThread extends Thread
{
	Product p;
	SecondThread(Product p)
	{
		this.p=p;
	}
	public void run()
	{
		p.PrintProduct(50);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
   //shared resource
    Product obj=new Product();
	FirstThread first=new FirstThread(obj);
	SecondThread second=new SecondThread(obj);
	first.setName("first Thread");
	second.setName("second Thread");
	
	first.start();
	second.start();
	}

}
