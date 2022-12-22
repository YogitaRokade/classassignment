//For printing Identity matrix
package arrayexamples;

import java.util.Scanner;

public class IdentityMatrix {
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
		
		//identity matrix
		System.out.println("The identity matrix is");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				if(i==j)
				{ 
				System.out.print(1+"  ");	
				}
				else
				{
				System.out.print(0+"  ");	
				}
				
			}
			System.out.println(" ");
		}
	
	}
}
