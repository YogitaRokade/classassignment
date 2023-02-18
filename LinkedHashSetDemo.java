package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer>linkedSet=new LinkedHashSet<Integer>();
		linkedSet.add(10);
		linkedSet.add(20);
		linkedSet.add(30);
		linkedSet.add(40);
		System.out.println(linkedSet);

		TreeSet<Integer>treeset=new TreeSet<Integer>(linkedSet);
		
		TreeSet<Integer>tree=new TreeSet<Integer>();
		tree.add(50);
		tree.add(10);
		tree.add(90);
		tree.add(20);
		tree.add(30);
		
		Iterator itr=tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
