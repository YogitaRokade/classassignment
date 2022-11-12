package oopsconcept;
class Constructor
{
	int id;
	String name,designation;
	double basicSalary;
	//parameterized constructor
	
	public Constructor(int id,String name,String designation,double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}
	public void display()
	{
		System.out.println("id :"+id+"\n"+"name :"+name+"\n"+"designation :"+designation+"\n"+"basicSalary :"+basicSalary);
	}
}

public class Employee 
{
	public static void main(String []args)
	{
		Constructor emp1=new Constructor(101,"Yogita","Manager",30000);
		Constructor emp2=new Constructor(102,"Shubhangi","Manager",20000);
		emp1.display();
		System.out.println("--------------------------------------------------------");
		emp2.display();
	}

}
/*
 * default constructor-which will design default value
 * parameterized constructor-which will assign different value according to user
 */
