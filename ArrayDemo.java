package arrayexamples;
import java.util.Scanner;
public class ArrayDemo {
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
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("five elements are");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
