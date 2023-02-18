package oopsconcept;
class UserDetails
{
	int id;
	String name;
	long phno;
	
	BankAccount bankAccount;//entity reference
	Company company;  //entity reference
	public UserDetails(int id,String name,long phno,BankAccount bankAccount,Company company)
	{
		super();
		this.id=id;
		this.name=name;
		this.phno=phno;
		this.bankAccount=bankAccount;
		this.company=company;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPhno() {
		return phno;
	}

	public Company getCompany() {
		return company;
	}


	public BankAccount getBankAccount() {
		return bankAccount;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", phno=" + phno + ","
				+ "\n"+"Company"+company+", bankaccount=" + bankAccount +"]";
	}

	
}


public class AggregationDemo {
	public static void main(String []args)
	{
		BankAccount acc1=new BankAccount("SBI",1111,"Hadapsar");
		BankAccount acc2=new BankAccount("ICICI",2222,"Ahmednagar");
		
		Company tcs=new Company(101,"TCS","Pune");
		Company capgemini=new Company(102,"Capgemini","Hydrabad");
		
		UserDetails yogita=new UserDetails(1,"Yogita",96657683,acc2,tcs);
		UserDetails swapnil=new UserDetails(1,"Swapnil",96652324,acc1,capgemini);
		
		System.out.println(yogita);//using to String method
		System.out.println("*************************************************************");
		
		//using getter method
		
		System.out.println("Id :"+swapnil.getId());
		System.out.println("Name :"+swapnil.getName());
		System.out.println("Phone no :"+swapnil.getPhno());
		
		//bank details
		System.out.println("Bank name :"+swapnil.getBankAccount().getBankName());
		System.out.println("Account number :"+swapnil.getBankAccount().getAccountNo());
		System.out.println("Branch :"+swapnil.getBankAccount().getBranch());
		
		System.out.println();
		//company details
		System.out.println("Company id :"+swapnil.getCompany().getCompanyId());	
	    System.out.println("Company Name :"+swapnil.getCompany().getCompanyName());
	    System.out.println("Company id :"+swapnil.getCompany().getCompanyAddress());	
		
		
	}

}
