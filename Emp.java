package oopsconcept;
class StaticVariable
{
	int id;
	String name,designation;
	double basicSalary;
	static String organisation="Anudip";  //class static variable.
	
	//Parameterized constructor
	//it will not return any value explicitly , implicitly
	//it will returns reference of object.
	public StaticVariable(int id,String name,String designation,double basicSalary	)
	{
	this.id=id;	
	this.name=name;
	this.designation=designation;	
	this.basicSalary=basicSalary;	
	}
	public void display()
	{
		System.out.println("id: "+this.id+" "+"name: "+this.name+" "+"designation: "+this.designation+
				" "+"basicSalary: "+this.basicSalary+" "+"organiation : "+organisation);
		
	}
}

public class Emp {
	public static void main(String []args )
	{
		StaticVariable emp1=new StaticVariable(101,"Yogita","Manager",30000);
		StaticVariable emp2=new StaticVariable(102,"Swapnil","Devloper",20000);
		emp1.display();
		emp2.display();
	}
	

}

