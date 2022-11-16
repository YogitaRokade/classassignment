package oopsconcept;

class Bank1
{
	int rateOfIntrest()
	{
		return 8;
	}
}
class Sbi extends Bank1
{
	@Override
	int rateOfIntrest() //overridden method
	{
		return 7;
	}
}
class Axis extends Bank1
{
	@Override
	int rateOfIntrest()//overridden method
	{
		return 5;
	}
}
public class HierarchicalInheritance {
	public static void main(String []args)
	{
		Sbi sbi=new Sbi();
		System.out.println("Rate of intrest of SBI : "+sbi.rateOfIntrest()+"%");
		Axis axis=new Axis();
		System.out.println("Rate of intrest of Axis : "+axis.rateOfIntrest()+"%");
	}

}
