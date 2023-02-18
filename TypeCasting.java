package oopsconcept;
class Bank5
{
	int rateOfIntrest()
	{
		return 8;
	}
}
class Sbi5 extends Bank5
{
	int rateOfIntrest()
	{
		return 7;
	}
}
class Axis5 extends Bank5{
int rateOfIntrest()
{
	return 5;
}
}
public class TypeCasting {
	public static void main(String []args)
	{
		Bank5 bank;
		bank=new Sbi5();
		System.out.println("rate of intrest : "+bank.rateOfIntrest()+"%");
		
		bank=new Axis5();
		System.out.println("rate of intrest : "+bank.rateOfIntrest()+"%");
	}

}
