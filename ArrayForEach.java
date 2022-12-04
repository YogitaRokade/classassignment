package arrayexamples;

import java.util.Scanner;

public class ArrayForEach {
	public static void main(String []args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		//initialization
		//compile time
		//arr[0]=2
		//arr1[1]=3
				//runtime
		System.out.println("Enter five element");
		for(int i=0;i<5;i++)  //it indicates index
		{
			arr[i]=sc.nextInt();
			
		}
		//To print the value
		System.out.println("five elements are");
		//for(int i=0;i<5;i++)
		//{
		//	System.out.println(arr[i]);
		//}
		//print value using for-each loop
		//java for-each
		System.out.println("Printing elements using for-each loop");
		for(int var:arr)
		{
			System.out.println(var);
		}
		sc.close();
	}
}
