package oopsconcept;
import java.util.Scanner;
class Student{
	int id;  //instance variable.
	String name,address,course;
	float fee;
	long cont;
	void setData(int id,String name,String address,String course,float fee,long cont)//parameters
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.course=course;
		this.fee=fee;
		this.cont=cont;
		System.out.println("this keyw0rd"+this);
		//displayData()
	}
	void displayData()
	{
		System.out.println("Id :"+id+"\n"+"Name :"+name+"\n"+"Address :"+address+"\n"+"Course:"+course+"\n"+"fee:"+fee+"\n"
				+ "contact:"+cont);	
	}
}//end of class
public class Demo {
	public static void main(String []args)
	{
		int id,n,i;  //instance variable.
		String name,address,course;
		float fee;
		long cont;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{   System.out.println("********************************************************");
			System.out.println("Enter id");
			id=sc.nextInt();
			sc.nextLine();//it will consume the delimiter
			System.out.println("Enter name");
			name=sc.nextLine();
			System.out.println("Enter address");
			address=sc.nextLine();
			System.out.println("Enter course");
			course=sc.nextLine();
			System.out.println("Enter fee");
			fee=sc.nextFloat();
			System.out.println("Enter contact number");
			cont=sc.nextLong();
			//anonymous object creation
			Student obj=new Student();
			obj.setData(id,name,address,course,fee,cont);
			System.out.println("obj object:"+obj);
			System.out.println("************************************************************");
			obj.displayData();
			
		}
	
		
	}

}
