package presentation;

import java.util.Scanner;

import model.BankAccountPojo;
import service.BankAccountService;
import service.BankAccountServiceImpl;

public class BankAccountManagmentSystem {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		char proceed = 'y';
		
		while(proceed == 'y') {
			System.out.println("*******************************");
			System.out.println("BANK ACCOUNT MANAGMENT SYSTEM");
			System.out.println("*******************************");
			System.out.println("1. Create new user");
			System.out.println("2. Login as existing user");
			System.out.println("3. Exit");
			System.out.println("*******************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*******************************");
			switch(option) {
			case 1:
				BankAccountPojo newBankAccountPojo = new BankAccountPojo();
				System.out.println("Enter desired username:");
				scan.nextLine();
				newBankAccountPojo.setUserName(scan.nextLine());
				System.out.println("Enter desired password:");
				newBankAccountPojo.setPassword(scan.nextLine());
				System.out.println("Enter your initial funds: ");
				newBankAccountPojo.setFunds(scan.nextDouble());
				BankAccountPojo bankAccountPojo = bankAccountService.addUser(newBankAccountPojo);
				System.out.println("*******************************");
				System.out.println("New user created! \nYour new User ID is:" + bankAccountPojo.getAccountId());
				break;
			case 2:
				System.out.println("Enter Userame:");
				String enterUserName = scan.next();
				
			}
		
		}
	}

}
