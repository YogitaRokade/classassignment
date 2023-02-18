/*Que: create class vaccine.create 2 concrete method firstDose() and 2ndDose().
*Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs.
*Scenario 2: user can take 2nd dose if already the first dose has completed.
*Scenario 3: create class Boostar dose and extend vaccine class.create static method boosterDose()
*in class Bootstar dose.if user has completed dose 1 and dose 2 then they are eligible for booster dose.
*/
package oopsconcept;
import java.util.Scanner;
class Vaccine
{   
	

	 boolean firstDose()
	{ 
		
		System.out.println("Your first dose is done");
		System.out.println("You pay 250 rs for vaccine");
		 return  true;
	}

	 boolean secondDose(String n)
		{ 
			
		
			return true;
		}
	 
}
class BoosterDose extends Vaccine
{
	
}


public class VaccineDemo {
	public static void main(String []args)
	{
		int age;
		 String nationality;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  citizanship and age  ");
		nationality=sc.nextLine();
		age=sc.nextInt();
		
		 if((age>18) &&(nationality=="indian")) 
		 {
	
		System.out.println("You are eligible for first dose");
		Vaccine v=new Vaccine();
	
	
		}
	}
}

