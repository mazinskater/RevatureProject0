package dao;

import model.BankAccountPojo;

public interface BankAccountDao {
	
	BankAccountPojo addUser(BankAccountPojo bankAccountPojo); //create new user
	
	BankAccountPojo depositFunds(int funds); //deposit funds
	
	void withdrawFunds(int funds); //withdraw funds
	
	BankAccountPojo getFunds(int funds); //display funds
	

}
