package oopsconcept;
class Person
{
int id;
String name,address;

public Person(int id,String name,String address)
{
super();
this.id=id;
this.name=name;
this.address=address;
}
public Person()
{
	super();
}
void display()
{
	System.out.println("id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
}
}
class StudentDetails extends Person//parent
{
	float marks;
	public StudentDetails(int id,String name,String address,float marks)
	{
		super(id,name,address);
		this.marks=marks;
	}
	void display()
	{
		float marks=80.05f;
		super.display();
		System.out.println("marks:"+this.marks);
	}
}
class child extends StudentDetails //child
{
	long phno;
	public child(int id,String name,String address,float marks,long phno)
	{
		super(id,name,address,marks);
		this.phno=phno;
	}
	void display()
	{
		super.display();
		System.out.println("phone number:"+phno);
	}
}

public class MultiLevel {
	public static void main(String []args)
	{
		child obj=new child(1,"Yogita","nagar",80.010f,9665768316l);
		obj.display();
		
		
	}

}
