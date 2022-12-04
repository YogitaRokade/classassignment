package arrayexamples;

import java.util.Scanner;


public class LinearWithMethod {
	public static void main(String []args)
	{
		int arr[],size,i,key;
		boolean flag=false;
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
		searchElement(arr,key);
		
	}

	private static void searchElement(int[] arr, int key) {
		// TODO Auto-generated method stub
		int i;
		boolean flag=false;
		for(i=0;i<arr.length;i++)	//i=4<10 t
		{
			if(arr[i]==key)	//arr[4]=23==23 t
			{
				flag=true;
				System.out.println(key+ " found at "+(i+1)+" position");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(key+ " element not found ");
		}
	}
}
