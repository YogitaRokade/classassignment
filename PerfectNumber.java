package basicprogram;
import java.util.Scanner;
//perfect number=6 divide by 1+2+3 is also 6.
public class PerfectNumber {
	public static void main(String []args)
	{
	int n,i,sum=0,temp;
	System.out.println("Enter number you want to check perfect or not");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	temp=n;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		System.out.println(temp+" is perfect number.");
	}
	else
	{
		System.out.println(temp+" is not perfect number.");
	}
	}
}
