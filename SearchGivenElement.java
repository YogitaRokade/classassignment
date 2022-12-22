package arrayexamples;

import java.util.Scanner;

public class SearchGivenElement {
	public static void main(String []args)
	{    String str;
	   char ch='o';
	 int i;
		System.out.println("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
	
		for(i=0;i<str.length();i++)
		{
		if(ch==str.charAt(i))
		{
			break;
		}
		}
		System.out.println(ch+ " Present in : "+i+" th position");
		
	}

}
