package basicprogram;
import java.util.Scanner;
public class MarksAndGrade {
	 public static void main(String []args)
	 {
	  	float m1,m2,m3,m4,m5,total,avg,per;
	 //Accept the marks of five student from user
	  	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter marks of Five subject");
	 	m1=sc.nextFloat();
	 	m2=sc.nextFloat();
	 	m3=sc.nextFloat();
	 	m4=sc.nextFloat();
	 	m5=sc.nextFloat();
	 //calculate total
	 	total=m1+m2+m3+m4+m5;
	 	System.out.println("Total Marks of 5 Subjects:"+total);
	 //calculate average
	 	avg=total/5;
	 	System.out.println("Average:"+avg);
	 //Calculate Percentage
	 	per=(total/500)*100;
	 	System.out.println("percentge:"+per+"%");
	 	if(total>300)
	 	System.out.println("Pass");
	 	else
	 	System.out.println("Fail");
	 	
	 	
	 	if(per>=80)
	 	{
	 	System.out.println("Your grade is :A");
	 	}
	 	else if(per>=60)
	 	{
	 	System.out.println("Your grade is : B");
	 	}
	 	else if(per>=40)
	 	{
	 	System.out.println("Your grade is : C");
	 	}
	 	else
	 	{
	 	System.out.println("Your grade is : D");
	 	}

	 }

}
