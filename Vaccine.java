package ExceptionHandeling;

import java.io.IOException;
import java.util.Scanner;
class VaccineDetails
{
	int age;

	public int getAge() {
		return age;
	}

	public VaccineDetails(int age) {
		super();
		this.age = age;
	}
	
	
}

public class Vaccine {
	
		public static void getAge(int age)
				throws AgeNotValidForVaccineException
				{
			if(age>=18) 
			 {

			System.out.println("You are eligible for first dose");
			 
			 }
			 
			 else
			 {
				 throw new AgeNotValidForVaccineException ("Age not valid for vaccination"); 
			 }
				}
public static void main(String []args)
		{   
		   try
		   {
			Vaccine.getAge(8);
		    }
		catch(AgeNotValidForVaccineException a)
		  {
			System.out.println(a.getMessage());
		  }
		
		}
}

		
	
		
	


