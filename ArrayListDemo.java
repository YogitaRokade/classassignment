package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<Integer>list1=new ArrayList<Integer>();
		//List<Integer>list2=new ArrayList<Integer>();
		list1.add(12);
		list1.add(22);
		list1.add(12);
		list1.add(32);
		list1.add(42);
		list1.add(52);
	
	System.out.println(list1);
	System.out.println("Before adding more elements"+list1.size());
	list1.add(62);
	list1.add(72);
	System.out.println(list1);
	System.out.println("After dding more elements"+list1.size());
	
	list1.add(4,100);
	System.out.println(list1);
	list1.set(4,150);
	System.out.println(list1);
	list1.remove(3);
	System.out.println(list1);
	
	//iterate arraylist using for each loop
	System.out.println("iterate arraylist  using for each loop");
	for(Integer i:list1)
	{
		System.out.print(i+"  ");
	}
	//sort the list
	Collections.sort(list1);
	System.out.println("After sorting elements are: ");
	System.out.println(list1);
	
	System.out.println("Iterate arraylist using for loop");
	for(int i=0;i<list1.size();i++)
	{
		System.out.println(list1.get(i));
	}
	System.out.println("Iterate arraylist using while loop");
	int i=0;
	while(i<list1.size())
	{
	 System.out.println(list1.get(i));
	 i++;
	}
	
	System.out.println("using iterator");
	Iterator itr=list1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//convert array to arraylist
	String names[]= {"yogita","rani","shraddha","teja"};
	ArrayList<String>alist=new ArrayList<String>(Arrays.asList(names));
	System.out.println(alist);
	alist.add("swapnil");
	alist.add("ram");
	
	for(String s:alist)
	{
		System.out.println(s);
	}
	//another way
	
	ArrayList<String>alist2=new ArrayList<String>();
	Collections.addAll(alist2, names);
	
	alist2.add("shubhangi");
	alist2.add("lila");
	
	System.out.println("alist2"+alist2);
	
	//manually
	ArrayList<String>alist3=new ArrayList<String>();
	for(int c=0;c<names.length;c++)
	{
		alist3.add(names[c]);
		
	}
	System.out.println("alist3"+alist3);
	}
}
