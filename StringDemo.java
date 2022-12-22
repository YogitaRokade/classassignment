package arrayexamples;

import java.util.Scanner;

public class StringDemo {
	public static void main(String []args)
	{
		String input;
		char ch;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to count no. of vowels");
		input=sc.nextLine();  //we are learning string
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')||(ch=='O'||ch=='o')
					||(ch=='U'||ch=='u'))
			{
				count++;//3
			}
		}
		System.out.println("no.of vowels are : "+count);
		
	}

}
