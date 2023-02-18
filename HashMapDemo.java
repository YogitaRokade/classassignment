package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String args[])
	{
		Map<Integer,String>hmap= new HashMap<Integer,String>();
		hmap.put(101, "yogita");
		hmap.put(102, "aarohi");
		hmap.put(103, "veera");
		hmap.put(104, "swara");
		
		Set set=hmap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		hmap.remove(102);
		hmap.replace(103, "pooja");
		hmap.replace(101, "yogita", "Yogit rokade");
		System.out.println("Hashmap after removing");
		for(Map.Entry entry:hmap.entrySet())
		{
			System.out.println("key"+entry.getKey()+"Value:"+entry.getValue());
		}
		
		//search key
		System.out.println(hmap.containsKey(106));
		System.out.println(hmap.containsValue("swara"));
		
		//sorting hashmap by key
		
		Map<Integer,String>map=new TreeMap<Integer,String>(hmap);
		System.out.println("hashmap fter sorting");
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println("key"+entry.getKey()+"Value:"+entry.getValue());
		}
		
		
     LinkedHashMap<String,Integer>linked=new LinkedHashMap<String,Integer>();
     linked.put("chicken momo", 120);
     linked.put("veg momo", 101);
     linked.put("chicken cutlet", 202);
     linked.put("nudels", 200);
     
     System.out.println("Hashmap after sorting");
     
     for(Map.Entry entry:linked.entrySet())
		{
			System.out.println("key"+entry.getKey()+"Value:"+entry.getValue());
		}
	}
}
