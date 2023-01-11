package multithreading;

public class DeadlockDemo {
	public static void main(String args[])
	{
		String resource1="pen";
		String resource2="paper";
		//thread yogita lock pen,tries to lock paper
		Thread yogita=new Thread()
	 {
		public void run()
		{
			synchronized(resource1)
			{
				System.out.println("yogita lock pen");
				
				try {
					Thread.sleep(200);
					}
				catch(Exception e)
				{
					
				}
				
				synchronized(resource2)
				{
					System.out.println("Yogita trying to lock paper");
				}
				
			}
			
		}
	  };
	  
	  //thread swapnil lock paper,tries to lock pen
	  Thread swapnil=new Thread()
			  {
		  public void run()
			{
				synchronized(resource2)
				{
					System.out.println("swapnil lock paper");
				
				   try {
					Thread.sleep(200);
				    }
				catch(Exception e)
				  {
					
				  }
				   
				synchronized(resource1)
				{
					System.out.println("Swapnil trying to lock pen");
				}
				
			}
			  }
			  };
			  
			  yogita.start();
			  swapnil.start();
	}

}
