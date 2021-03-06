package dao;

import model.BankAccountPojo;

public interface BankAccountDao {
	
	BankAccountPojo addUser(BankAccountPojo bankAccountPojo); //create new user
	
	BankAccountPojo depositFunds(BankAccountPojo bankAccountPojo); //deposit funds
	
	BankAccountPojo withdrawFunds(BankAccountPojo bankAccountPojo); //withdraw funds
	
	BankAccountPojo getFunds(int accountId); //display funds
	

}
