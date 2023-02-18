package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapUsingClass {

	public static void main(String[] args) {
		//Employee emp1=new Employee(1,"yogita",45000);
	//	Employee emp2=new Employee(2,"swapnil",50000);
		//Employee emp3=new Employee(3,"shubhangi",55000);
	
		HashMap<Integer,Employee>hashmap=new HashMap<Integer,Employee>();
		hashmap.put(1, new Employee(1,"yogita",45000));
		hashmap.put(2, new Employee(2,"swapnil",50000));
		hashmap.put(3, new Employee(3,"shubhangi",55000));
		
//		Set<Map.Entry<Integer,Employee>>entry=hashmap.entrySet();
//		for(Map.Entry<Integer, Employee>emp:entry)
//		{
//			System.out.print("Key"+emp.getKey());
//			System.out.println("Employee ID: "+emp.getValue().getEmpId()+
//				"Name: "+emp.getValue().getEmpName()+"Salary: "+emp.getValue().getSalary());	
//		}
		
		Iterator<Integer>itr=hashmap.keySet().iterator();
		while(itr.hasNext())
		{
			//itr.next() will return key -1
			//hashmap.get(1);return employee object based on key
			Employee e=hashmap.get(itr.next());
			e.display();
		}
	}
}
