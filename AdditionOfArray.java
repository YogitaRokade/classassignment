package arrayexamples;

import java.util.Scanner;

public class AdditionOfArray {
	public static void main(String []args)
	{
		int a[][],b[][],c[][],i,j,row,col1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row : ");
		row=sc.nextInt();
		
		System.out.println("Enter column : ");
		col1=sc.nextInt();
		
		//initialize array
		
		a=new int[row][col1];
		b=new int[row][col1];
		c=new int[row][col1];
		
		System.out.println("Enter element of first array");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				a[i][j]=sc.nextInt();
			}
	
		}
	System.out.println("Enter element of second array");	
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				b[i][j]=sc.nextInt();
			}

		}
		//addition of two matrix
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
	
		}
		System.out.println("Addition of two matrix are");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println("");
		}
	}

}
