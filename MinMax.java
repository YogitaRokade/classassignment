package basicprogram;
import java.util.Scanner;
public class MinMax {
	public static void main(String []args)
	{
	 	int num1,num2,num3;
	//Accept the three numbers from user to check greater number
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number you want to check");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2)
		{
		if(num1>num3)
		System.out.println(" Maximum from three is:"+num1);
		else
		System.out.println("Maximum Number is:"+num3);
		}
		else
		{
		if(num2>num3)
		{
		System.out.println("maximum number is:"+num2);
		}
		else
		System.out.println("maximum number is:"+num3);
	        }
	}

}
