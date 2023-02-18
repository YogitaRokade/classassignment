package oopsconcept;

public class WrapperClassDemo {

	public static void main(String args[])
	{
		//convert int to Integer auto-boxing
		int a=30;
		//explicitly conversion
		Integer in=Integer.valueOf(a);
		System.out.println(in);
		
		//auto-boxing convert automatically
		Integer i=a;
		System.out.println(i);
		
		float f=50;
		Float f1=Float.valueOf(f);
		
		Float flt=f;
		System.out.println(f1+"  "+flt);
		 
		short s=90;
		Short ss=new Short(s);
		System.out.println(ss);
		
		//Un-boxing-object to primitive
		
		Integer r=45;
		//convert explicitly Integer to int 
		int b=r.intValue();
		System.out.println(b);
		
		//un-boxing automatically conversion done
		int c=r;
		
		byte bt=23;
		Byte bb=bt;
		
	}
	
}
