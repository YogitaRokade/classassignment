package basicprogram;
import java.util.Scanner;
public class Pattern {
	public static  void main(String []args)
	{
		int i,j,n;
		System.out.println("Enter how many rows  and columns you want");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
