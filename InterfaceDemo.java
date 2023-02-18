package oopsconcept;

interface MyInterface1
{
	public void method1();
	int x=23;
}

interface Drawable extends MyInterface1
{
	public void draw();
	int y=30;
	public void method1();
}
interface AAAA
{
	public void draw();
	int b=7;
}
class add implements MyInterface1,AAAA  //CLASS AND INTERFACE=IMPLIMENTS(AS LIKE MULTIPLE INHERITANCE)
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("We can drawing circle");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Override method of interface");
	}
	
}
public class InterfaceDemo {
	public static void main(String []args)
	{
		add obj=new add();
		obj.method1();
		obj.draw();
		System.out.println(MyInterface.x);
		System.out.println(AAAA.b);
	}

}
