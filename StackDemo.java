package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String>stack=new Stack<String>();
		stack.push("yogita");
		stack.push("swapnil");
		stack.push("shubhangi");
		stack.push("veera");
		
		for(String s:stack)
		{
			System.out.println(s);
		}
		System.out.println(stack.empty());
		String poped=stack.pop();
		System.out.println(poped);
		
		String p=stack.peek();
		System.out.println("Peeked element: "+p);
		
		for(String s:stack)
		{
			System.out.println(s);
		}
	}

}
