package oopsconcept;

class eat
{
	
	public void method2() 
	{
		System.out.println("It is method 2");
	}
	
}
class sleep extends eat
{
	public void method2()
	{
	
		super.method2();
		System.out.println("it is method3");
	}
}
interface MyOwn
{
	public void n1();
}
class drink extends sleep implements MyOwn
{
	
	public void n1()
	{
		System.out.println("This is class n");
	}
}
public class Hybrid1 {
	public static void main(String []args)
	{
		drink d=new drink();
		d.method2();
		d.n1();
	}

}
