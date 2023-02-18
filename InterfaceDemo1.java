package oopsconcept;
/*
 * we cannot  instantiate interface but we can create reference variable of interface  
 */
interface MyInterface       //interface1
{
	public void method1();
	int x=23;
	default void fun()
	{
		System.out.println("we can add method  body in interface using default");
		add(10,20);
		sub(12,10);
	}
	static int Cube(int n)
	{
		return n*n*n;
	}
	private void add(int a,int b)
	{
		System.out.println("add :"+(a+b));
	}
	private void sub(int a,int b)
	{
		System.out.println("sub :"+(a-b));
	}
}
class Test	//class1
{
	int id;
	void test(int id)
	{
		this.id=id;
	}
	void getValue()
	{
		System.out.println(id);
	}
}
interface aa
{
	static String draw()
	{
		return "it is drawing";
	}

}
class demo1 extends Test implements MyInterface,aa
{
	demo1(int id)
	{
		//super(id);
	}
	@Override
	public void method1()
	{
		System.out.println("overriden method of interface");
	}
}
public class InterfaceDemo1 {
public static void main(String []args)
{
	demo1 obj=new demo1(12);	//upcasting
	obj.method1();
	obj.getValue();
	obj.fun();
	System.out.println(MyInterface.Cube(5));	//	we can call static method by interface name
	System.out.println(aa.draw());
		//to call the interface name, variable name
}
}
