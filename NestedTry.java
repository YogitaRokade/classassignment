package ExceptionHandeling;

public class NestedTry {
	public static void main(String []args)
	{
		try
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
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	
		}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
