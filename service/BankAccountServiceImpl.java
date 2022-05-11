package service;

import dao.BankAccountDao;
import dao.BankAccountDaoImpl;
import model.BankAccountPojo;

public class BankAccountServiceImpl implements BankAccountService {
	
	BankAccountDao bankAccountDao;
	
	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();
	}

	@Override
	public BankAccountPojo addUser(BankAccountPojo bankAccountPojo) {
		return bankAccountDao.addUser(bankAccountPojo);
	}

	@Override
	public BankAccountPojo depositFunds(BankAccountPojo bankAccountPojo) {
		return bankAccountDao.depositFunds(bankAccountPojo);
	}

	@Override
	public BankAccountPojo withdrawFunds(BankAccountPojo bankAccountPojo) {
		return bankAccountDao.withdrawFunds(bankAccountPojo);
	}

	@Override
	public BankAccountPojo getFunds(int accountId) {
		return bankAccountDao.getFunds(accountId);
	}
	
	

}
