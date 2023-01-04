package ExceptionHandeling;
//shared resource
class Productt
{
	
static synchronized void printPrduct(int n)  // synchronize
{
	 System.out.println("out of synchronization block");

	
for(int i=1;i<=5;i++)	
{
	
System.out.println(Thread.currentThread().getName()+" "+n*i);

try {
	Thread.sleep(500);
	
}catch (Exception e) {
	System.out.println(e);
}

}//loop


System.out.println("end of method");
}//method

}//class


public class SynchronizationDemo {

	public static void main(String[] args) {
	
		//shared resource
		//Product obj=new Product(); //lock associated with object
		//Product obj1=new Product();
		//these two thread are acquires product class lock
	     new Thread("t1")
				{
			public void run() {
				Productt.printPrduct(5); //lock associated with class
			}
				}.start();
				
				new Thread("t2")
						{
					public void run() {
						Productt.printPrduct(200);
					}
						}.start();
						
						
						//these two thread are acquires Addition class lock
						new Thread("t3")
						{
					public void run() {
						Productt.printPrduct(500);
					}
						}.start();
						
						new Thread("t4")
						{
					public void run() {
						Productt.printPrduct(1000);
					}
						}.start();
	
	}

}
