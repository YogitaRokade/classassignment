package basicprogram;

import java.util.Scanner;

public class ReverseOfNum {
	public static void main(String [] args)
	{
		int n,reverse=0,temp,rem;
		Scanner sc=new Scanner(System.in);
		//input number from user.
		System.out.println("Enter number to reverse");
		n=sc.nextInt();
		temp=n;
		//run loop till n is greater than 0.
		while(n>0)
		{
			
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		//display the reverse number.
		System.out.println("Reverse of "+temp+" is : "+reverse);
		if (temp==reverse)
			System.out.println(temp+" Is a palimdrom number");
		else
			System.out.println(temp+" Is a Not palimdrom number");
			
	}


}
