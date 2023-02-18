package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
public static void main(String args[])
{
	LinkedList<String>lList=new LinkedList<String>();
	lList.add("apple");
	lList.add("banana");
	lList.add("orange");
	lList.add("mango");
	System.out.println(lList);
	
	lList.addFirst("greps");
	lList.addLast("kiwi");
	lList.add(3,"jamun");
	
	System.out.println(lList);
	
	System.out.println("traverse linkedlist using iterator");
	Iterator itr=lList.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	String removed=lList.removeFirst();
	System.out.println("removed element: "+removed);
	System.out.println(lList);

	
	
	String last=lList.removeLast();
	System.out.println("removed element: "+last);
	System.out.println(lList);
	
	lList.remove(1);
	lList.remove("orange");
	System.out.println(lList);
	lList.set(0,"papaya");
	System.out.println(lList);
	
	System.out.println(lList.contains("papaya"));
	String obj=lList.get(2);
	System.out.println(obj);
	String first=lList.getFirst();
	String lasst=lList.getLast();
	System.out.println("first: "+first+" last: "+lasst);
	System.out.println(lList.indexOf("papaya"));
	lList.add("papaya");
	System.out.println(lList.lastIndexOf("papaya"));
	
	
}
}
