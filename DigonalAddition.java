package arrayexamples;

import java.util.Scanner;

public class DigonalAddition {
	public static void main(String []args)
	{
		int a[][],i,j,sum=0,row,col1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row : ");
		row=sc.nextInt();
		
		System.out.println("Enter column : ");
		col1=sc.nextInt();
		
		//initialize array
		
		a=new int[row][col1];
		
		
		System.out.println("Enter element of array");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				a[i][j]=sc.nextInt();
			}
	
		}
	
		//addition of diagonal elements of matrix
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
	
		}
		System.out.println("Addition of diagonal elements are : ");
		System.out.println(+sum);
		
	}

}
