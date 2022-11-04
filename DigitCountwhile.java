package basicprogram;

import java.util.Scanner;

public class DigitCountwhile {
	public static void main(String [] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		//input number from user.
		System.out.println("Enter number to count digit");
		n=sc.nextInt();
		//run loop till n is greater than 0.
		while(n!=0)
		{
			//incrementing digit count
			count++;
			//remove last digit from 'n'.
			n=n/10;
		}
		//display the total digits.
		System.out.println("Total number of  digits "+count);
	}


}
