package arrayexamples;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String []args)
	{
		int arr[],size,i,key,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		size=sc.nextInt();
		
		//instantiate array
		arr=new int[size];
		
		//initialize the array
		System.out.println("Enter "+size+" elements in array!!");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//input for search element
		System.out.println("Enter element you want to searching for!");
		key=sc.nextInt();
		for(i=0;i<size;i++)	//i=4<10 t
		{
			if(arr[i]==key)	//arr[4]=23==23 t
			{
				pos=i;	//pos=4
				//break
			}
		}
		if(pos!=-1)
		{
			System.out.println(key+ "found at "+(pos+1)+"position");
		}
		else
			System.out.println("Element not found in this array");
	}

}
