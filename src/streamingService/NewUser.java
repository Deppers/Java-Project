package streamingService;

public class NewUser extends UserAccount {
	
	private float balance;
	
	public NewUser(){
		super.setUserAccount(userName, accountNumber, userAge, userCountry);
		this.balance = getBalance();
	}//new user
	
	public void setBalance(float balance){
		this.balance = balance;
	}//set balance
	
	public float getBalance(){
		return this.balance;
	}
	
}
