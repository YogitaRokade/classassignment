package oopsconcept;

class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;

public User(int userId,String firstName,String lastName)
{
	this.userId=userId;
	this.firstName=firstName;
	this.lastName=lastName;
}
public User(int userId,String firstName,String lastName,String address,long phno)
{
	this(userId,firstName,lastName);
	this.address=address;
	this.phno=phno;
}
public User(int userId,String firstName,String lastName,String address,long phno,String userName,String password)
{
	this(userId,firstName,lastName,address,phno);
	this.userName=userName;
	this.password=password;
}
public String getPassword() {
	return password;
}
public int getUserId()
{
	return userId;
}
public String getUserName()
{
	return userName;
}
public String getfirstName()
{
	return firstName;
}
public String getlastName()
{
	return lastName;
}
public String getaddress()
{
	return address;
}
public long getphno()
{
	return phno;
}
}
public class ConstructorOverloadingEx {
public static void main(String [] args)
{
	User user1=new User(1,"Yogita","Rokade","Ahmednagar",9665768316l,"yogita","y123");
	System.out.println("ID :"+user1.getUserId());
	System.out.println("Firstname :"+user1.getfirstName());
	System.out.println("Lastname:"+user1.getlastName());
	System.out.println("Address :"+user1.getaddress());
	System.out.println("phone number :"+user1.phno);
	System.out.println("username:"+user1.getUserName());
	System.out.println("password :"+user1.getPassword());
	
	
	System.out.println("***********************************************");
	
	User user2=new User(2,"Swapnil","Rokade","Ahmednagar",96657683123l,"swapnil","swap123");
	System.out.println("ID :"+user2.getUserId()+"\n"+"Firstname : "+user2.getfirstName()+"\n"+"Lastname:"+user2.getlastName()+"\n"
	+"Address :"+user2.getaddress()+"\n"+"phone number :"+user2.phno+"\n"+"username:"+user2.getUserName()+"\n"+"password :"+user2.getPassword());
	
}
}
