package collection;

import java.util.ArrayList;

public class UserDefineArrayList {

	public static void main(String[] args) {
		//Employee emp1=new Employee();
		//emp1.setEmpId(1);
		//emp1.setEmpName("Yogita");
		//emp1.setSalary(50000);

		//Employee emp2=new Employee(2,"rani",40000);
		//Employee emp3=new Employee(3,"sayli",60000);
		
		ArrayList<Employee>employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(1,"yogita",50000));
		employeeList.add(new Employee(2,"rani",40000));
		employeeList.add(new Employee(3,"sayali",60000));
		
		//traverse the arraylist
		
		for(Employee e:employeeList)
		{
			//system.out.println(e);
			System.out.println("Id: "+e.getEmpId()+" Name: "+e.getEmpName()
			+" salary: "+e.getSalary());
		}
		
		
	}

}
