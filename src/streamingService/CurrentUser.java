package streamingService;

public class CurrentUser extends UserAccount {
		
		private float balance;
		
		public CurrentUser(){
			super.setUserAccount(userName, accountNumber, userAge, userCountry);
			this.balance = getBalance();
		}//new user
		
		public void setBalance(float balance){
			this.balance = balance;
		}//set balance
		
		public float getBalance(){
			return this.balance;
		}//get balance
		
	
}//class
