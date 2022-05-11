package service;

import model.BankAccountPojo;

public interface BankAccountService {
	
	BankAccountPojo addUser(BankAccountPojo bankAccountPojo); //create new user
	
	BankAccountPojo depositFunds(BankAccountPojo bankAccountPojo); //deposit funds
	
	BankAccountPojo withdrawFunds(BankAccountPojo bankAccountPojo); //withdraw funds
	
	BankAccountPojo getFunds(int accountId); //display funds

}
