package oopsconcept;

public class Company {
	int companyId;
	String companyName;
	String companyAddress;
	public Company(int companyId, String companyName, String companyAddress) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	//return the company Id
	
	public int getCompanyId() {
		return companyId;
	}
	
	//return the company Name
	
	public String getCompanyName() {
		return companyName;
	}
	//return the company Address
	
	public String getCompanyAddress() {
		return companyAddress;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ "]";
	}
	
	

}
