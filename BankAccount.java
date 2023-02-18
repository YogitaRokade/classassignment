package oopsconcept;

public class BankAccount {
	String bankName;
	float accountNo;
	String branch;
	public BankAccount(String bankName,float accountNo,String branch)
	{
		this.bankName=bankName;
		this.accountNo=accountNo;
		this.branch=branch;
	}
	public String getBankName() {
		return bankName;
	}
	
	public float getAccountNo() {
		return accountNo;
	}
	
	public String getBranch() {
		return branch;
	}
	//@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", accountNo=" + accountNo + ", branch=" + branch + "]";
	}
	//method
	
	
	

	

}
