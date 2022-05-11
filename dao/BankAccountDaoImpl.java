package dao;

import java.util.ArrayList;
import java.util.List;

import model.BankAccountPojo;

public class BankAccountDaoImpl implements BankAccountDao {
	
	//data store
	List<BankAccountPojo> allUsers = new ArrayList<BankAccountPojo>();
	
	public BankAccountDaoImpl() {
		BankAccountPojo user1 = new BankAccountPojo(0001, "skaterboi" , "password" , 2000);
		allUsers.add(user1);
	}

	@Override
	public BankAccountPojo addUser(BankAccountPojo bankAccountPojo) {
		int newAccountId = allUsers.get(allUsers.size() - 1).getAccountId() + 1;
		bankAccountPojo.setAccountId(newAccountId);
		allUsers.add(bankAccountPojo);
		return bankAccountPojo;
	}


	@Override
	public BankAccountPojo depositFunds(BankAccountPojo bankAccountPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccountPojo withdrawFunds(BankAccountPojo bankAccountPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccountPojo getFunds(int accountId) {
		//BankAccountPojo foundFunds = null;
		return null;
	}

}
