package ExceptionHandeling;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String []args)
	{ 
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Some Code");
		
		try
		{
		int arr[]=new int[5];
		arr[7]=56;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	
		}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
		//finally
		//{
		//sc.close();
		//	System.out.println("finally block always will execute");
			
		//}
		System.out.println("rest line of code !!");
		
}
}






