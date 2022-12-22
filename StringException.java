package ExceptionHandeling;

public class StringException {
	public static void main(String []args)
	{
//	try {
//	      String s="abc";
//			int i=Integer.parseInt(s);
			
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("String can't be converted as int");
//		}
		int arr[]=new int[5];
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}
		
/* this exception handle all type of exceptions,so when we using this
   exception no need other exceptions.or other exceptions not executed.
*/
		catch(Exception e)
		{
			System.out.println(e);
		}
/*		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("Array index out of bound");	
		}
*/
		System.out.println("rest line of code !!");
	}

}
