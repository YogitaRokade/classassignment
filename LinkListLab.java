//create linked list in type integer and performing operation
package collection;

import java.util.LinkedList;

public class LinkListLab {

	public static void main(String[] args) {
		LinkedList<Integer>lList=new LinkedList<Integer>();
//add data in a list
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		System.out.println(lList);
// Specific data in second position
       lList.add(2, 5);
	  System.out.println(lList);
		
//Retrieve first element from list and replace it with new item
		
		Integer first=lList.getFirst();
		System.out.println(first);
		
		lList.set(0, 6);
		System.out.println(lList);
		
//convert link list to array
		Object[] array=lList.toArray();
		for(int i=0;i<lList.size();i++)
		{
		System.out.println(array[i]);
		}

		
	}

}
