package basicprogram;
import java.util.Scanner;
public class EvenOdd {
	 public static void main(String []args)
	 {
	  	int num;
	  	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter Number which you want to check");
	 	num=sc.nextInt();
	 	
	 	//checking number is even or odd.
	 	
	 	if(num%2==0)
	 	System.out.println("Number is even");
	 	 else
	          System.out.println("Number is odd");
	 }
}
