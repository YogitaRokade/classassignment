package arrayexamples;

class Deposit extends Bank
{ 
	@Override
	public void bank()
	{
	
	}

	public Deposit(int bankId, String bankName, float balance, float withdrawl) {
		super(bankId, bankName, balance, withdrawl);
		// TODO Auto-generated constructor stub
	}
	
}
class Withdrawl extends Bank
{

	public Withdrawl(int bankId, String bankName, float balance, float withdrawl) {
		super(bankId, bankName, balance, withdrawl);
		// TODO Auto-generated constructor stub
	}
	
}
public class Bank {
	int bankId;
	String bankName;
	float balance,withdrawl;
	
	 public Bank(int bankId, String bankName, float balance, float withdrawl) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.balance = balance;
		this.withdrawl = withdrawl;
	}
	 
	public int getBankId() {
		return bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public float getBalance() {
		return balance;
	}

	public float getWithdrawl() {
		return withdrawl;
	}

	public void  bank()
	 {
		
	}
	public static void main(String[] args) {
		

	}

}
