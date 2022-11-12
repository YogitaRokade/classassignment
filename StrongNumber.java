package basicprogram;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String []args)
	{
		int n,temp,fact=1,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		//input number from user.
		System.out.println("Enter number You want to check strong number or not:");
		n=sc.nextInt();
		temp=n;
		//run loop till n is greater than 0.
		for(;n!=0;)
		{
           rem=n%10;
           
           for(int i=1;i<=rem;i++)
           {
        	   fact=fact*i;
           }
           
           sum=sum+fact;
           n=n/10;
		}

		//display the first and last digit.
		if(temp==sum) 
		{
		
		System.out.println(temp+" is strong number");
		}
		else
		{
			System.out.println(temp+" is not strong number");
		}
	}

}
