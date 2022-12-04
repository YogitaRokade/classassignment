package arrayexamples;

import java.util.Scanner;

public class TwoDimArray {
	public static void main(String []args)
	{
		int a[][],i,j,row,col1;
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
		
		System.out.println("the array in matrix form is : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}
