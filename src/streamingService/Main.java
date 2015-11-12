package streamingService;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) throws IOException 
	{
		char selection = ' ';
		boolean hasAcc = false;
		UserAccount u1, u2, u3;
		
		Random r = new Random();
		int accNo;
		
		
		u1 = new NewUser();
		u2 = new CurrentUser();
		u3 = new PremiumUser();
		
		Scanner console = new Scanner(System.in);
		Scanner in = new Scanner(new FileReader("user.txt"));
		PrintWriter writer = new PrintWriter("User.txt");
		
		System.out.println("Welcome User!");
		writer.println("Weclome User");
		writer.println(); 
		
		//Do the following while the selection is invalid
		do{
			System.out.print("Do you have an account?(Y / N): ");
			selection = console.next().charAt(0);
			selection = Character.toUpperCase(selection);
			System.out.println();
			
			switch(selection){
			case 'Y':
				hasAcc = true;
				break;
			case 'N':
				hasAcc = false;
				break;
			default:
				System.out.println("Invalid input");
			}
		}while(selection != 'Y' && selection != 'N');
		{

		//if the user does not have an account else has an account
		if(!hasAcc){
			System.out.println("Create an account");
			System.out.println("Please enter your name: ");
			String name = console.next();
			u1.setName(name);
			//u1.setAccountNo(acc);
			
			System.out.println(u1.getName());
		
		}	
		}
			
	
		
		in.close(); 
		writer.close();
		System.out.println("End of program");
		
	}
		
		
		
}
