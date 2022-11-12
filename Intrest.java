package basicprogram;
import java.util.Scanner;
public class Intrest {
	public static void main(String []args)
	{
	 	float principle,time,rate,si;
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		principle=sc.nextFloat();
		System.out.println("Enter time ");
		time=sc.nextFloat();
		System.out.println("Enter Rate");
		rate=sc.nextFloat();
	//calculate simple interest

		si=(principle*time*rate)/100;
		System.out.println("Your simple interest is:" +si);
	}

}
