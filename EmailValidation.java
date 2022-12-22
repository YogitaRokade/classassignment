package arrayexamples;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String []args)
	{
		String email;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id : ");
		email=sc.nextLine();
		
		if(email.endsWith("@gmail.com")||email.endsWith(".org")||email.endsWith(".in"))
		{
			
		System.out.println("email id is valid"); //true
		}
		else
			System.out.println("email id is not valid"); //true
	
		System.out.println("--------------------------------------------------------");
	//StrigBuilder
	StringBuilder builder=new StringBuilder("java");
	
	System.out.println(builder.capacity());
	builder.append(" is a platform languge");
	System.out.println(builder.capacity());
	builder.insert(18, " independent");
	builder.replace(5, 7, "will");
	System.out.println(builder);
	builder.delete(21, 32);
	System.out.println(builder);
	System.out.println("--------------------------------------------------------");
	
	//StringBuffer
	StringBuffer buffer=new StringBuffer("Welcome");
	System.out.println(buffer+" "+buffer.capacity());
	buffer.append(" To the world of java");
	System.out.println(buffer+""+buffer.capacity());
	buffer.deleteCharAt(5);
	System.out.println(buffer);
	//buffer.reverse();
	//System.out.println(buffer);
	buffer.setCharAt(5, 'm');
	System.out.println(buffer);
    String subString=buffer.substring(8);
    System.out.println(subString);
    String ss=buffer.substring(13,19);
    System.out.println(ss);
	
	
	
	}	

}
