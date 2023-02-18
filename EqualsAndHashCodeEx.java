package collection;


class Person extends Object
{
	int id;
	String name;
	int salary;
	
	
	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

   public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
		
//one way to compare
//override equals()from object class

public boolean equals(Object obj)    //emp1.equals(emp2)
{
	//if both objects has same reference or not
	
	if(this==obj)
		return true;
	
	//if parameter is null or both are not from same class
	if((obj==null)||(this.getClass()!=obj.getClass()))
	return false;
		
		//compare data members
		
		Person p=(Person)obj;
		return this.id==p.id
				&&this.name==p.name
				&&this.salary==p.salary;
	}
//override hashcode()

public int hashcode()
{
	return(this.id%10)*2;
}
}
public class EqualsAndHashCodeEx {

public static void main(String args[])
{
	
	//String str1="welcome";
	//String str2="welcome";
	//.out.println(str1.equals(str2));
	
	
	Person p=new Person(11,"yogita",40000);
	Person p1=new Person(67,"yogita",40000);
	Person p2=p;
	
	if(p.hashCode()==p2.hashCode())
	System.out.println(p.equals(p1));
	
	else
		System.out.println("not equal");
	System.out.println(p.hashCode()+" "+p2.hashCode());
}
}

