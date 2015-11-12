package streamingService;

public class UserAccount {

		
		String userName;
		int accountNumber;
		int userAge;
		String userCountry;
		
		public UserAccount(){
			
			setName(userName);
			setAccountNo(accountNumber);
			setAge(userAge);
			setCountry(userCountry);
		}//userAccount
		
		public void setUserAccount(String userName, int accountNumber, int userAge, String userCountry){
			this.userName = userName;
			this.accountNumber = accountNumber;
			this.userAge = userAge;
			this.userCountry = userCountry;
		}//set user account
		
		public void setName(String a){
			userName = a;
		}// set name
		
		public void setAccountNo(int a){
			accountNumber = a;
		}
		public void setAge(int a){
			userAge = a;
		}// set age
		public void setCountry(String a){
			userCountry = a;
		}//set country
		
		public String getName(){
			return this.userName;
		}// set name
		
		public int getAccountNo(){
			return this.accountNumber;
		}
		public int getAge(){
			return this.userAge;
		}// set age
		public String getCountry(){
			return this.userCountry;
		}//set country
	

}
