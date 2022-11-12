package basicprogram;
import java.util.Scanner;
public class Maximum {
	public static void main(String []args)
	{
	 	float num1;
	//Accept the two numbers from user
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number you want to check");
		num1=sc.nextFloat();
		if(num1>=0)
		System.out.println(" Number Is Positive:"+num1);
		else
		System.out.println(" Number Is negative:"+num1);
	}

}
