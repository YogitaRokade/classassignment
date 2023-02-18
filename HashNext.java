package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashNext {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("yogita");
		list.add("rokade");
		
		HashSet<String>hset=new HashSet<String>(list);
		hset.add("ram");
		hset.add("shyam");
		hset.add("om");
		hset.add("ovi");
		hset.add(null);
		hset.add("ram");
		
		Iterator itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		
		System.out.println(hset.hashCode());	
		System.out.println(hset.contains("ram"));
		hset.remove("rokade");
		System.out.println(hset);	
		
		//convert to array
		String name[]=new String[hset.size()];
		hset.toArray(name);
		System.out.println("Arrays are: ");
		for(String arr:name)
		{
			System.out.println(arr);
		}
		
		//convert to array
		System.out.println("arraylist");
		ArrayList<String>listt=new ArrayList<String>(hset);
		System.out.println(listt);
		
		
	}

	
}
