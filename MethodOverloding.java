package oopsconcept;
//method overloading 
class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
	}
}

public class MethodOverloding {
	public static void main(String [] args)
	{
		Calculator cal=new Calculator();
		System.out.println(cal.add(30f,40));
	}

}
