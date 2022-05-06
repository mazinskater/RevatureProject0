package dao;

import java.util.ArrayList;
import java.util.List;

import model.BankAccountPojo;

public class BankAccountDaoImpl implements BankAccountDao {
	
	//data store
	List<BankAccountPojo> allUsers = new ArrayList<BankAccountPojo>();
	
	public BankAccountDaoImpl() {
		BankAccountPojo user1 = new BankAccountPojo("skaterboi" , "password" , 2000);
		allUsers.add(user1);
	}

	@Override
	public BankAccountPojo addUser(BankAccountPojo bankAccountPojo) {
		allUsers.add(bankAccountPojo);
		return bankAccountPojo;
	}

	@Override
	public BankAccountPojo depositFunds(int funds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void withdrawFunds(int funds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BankAccountPojo getFunds(int funds) {
		// TODO Auto-generated method stub
		return null;
	}

}
