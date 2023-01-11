package multithreading;

class Account
{
	int amount=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println(" going to Withdraw amount"+amount);
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance");
			try
			{
				wait();
				
			}
			catch(Exception e)
			{
			}
				this.amount-=amount;//this.amount=amount-amount
				System.out.println(amount+" withdraw completed");
				System.out.println("Available balance: "+this.amount);
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println(" going depositing the amount"+amount);
		
				this.amount+=amount; //this.amount=amount+amount
				System.out.println(amount+" deposit completed");
				notifyAll();
			
	}
	synchronized void checkBalance()
	{
		try
		{
         wait();
	     }
		catch(Exception e)
		{
			
		}
		System.out.println("Available blance :  "+this.amount);
}
}
public class InnerThreadCommunication {

	public static void main(String[] args) {
		
		Account account=new Account();
		
		new Thread()
		{
			public void run()
			{
				account.withdraw(20000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				account.checkBalance();
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				account.deposit(30000);
			}
		}.start();
		
	}
	

}
