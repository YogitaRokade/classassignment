package ExceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo {
public static void main(String []args)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	try {
	
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException ae) {
		System.out.println("Divide by zero not posible");
		System.out.println("Exception occurs :"+ae);
		System.out.println("Exception occurs :"+ae.getMessage());
		ae.printStackTrace();

		
	}
	
	System.out.println("Rest line of code");	
	
}

}
