package oopsconcept;
abstract class AbstractDemo
{
	void fun() //Concreate method
	{
		System.out.println("WE are in abstract base class");
	}
	abstract void display();
}
//child class extend from base abstract class
class impl extends AbstractDemo
{
	@Override
	void display()
	{
		System.out.println("Display impl class");
	}
}
class impl2 extends AbstractDemo
{
@Override
void display()
{
	System.out.println("Display impl2 class");
}
}
public class AbstractionEx {public static void main(String []args)
	{
	AbstractDemo demo;
	demo=new impl();
	demo.display();
	
	demo=new impl2();
	demo.fun();
	demo.display();
	}

}
