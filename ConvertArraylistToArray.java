package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConvertArraylistToArray {
	public static void main(String args[])
	{
		List<String>list=new ArrayList<String>();
		list.add("ab");
		list.add("cd");
		list.add("ef");
		list.add("gh");
		list.add("vb");
		
		//convert array list to array
		
		String[]arr=list.toArray(new String[(list.size())]);
		for(String s:arr)
		{
			System.out.println(s);
			
		}
		//traverse array list in reverse order
		System.out.println("traversing the arraylist in reverse order");
		ListIterator<String>listItr=list.listIterator(list.size());
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}

}
