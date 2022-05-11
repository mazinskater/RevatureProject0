package model;

public class BankAccountPojo {
	
	//private variables
	private int accountId;
	private String userName;
	private String password;
	private double funds;
	
	public BankAccountPojo() {
		super();
	}
	
	
	public BankAccountPojo(int accountId, String userName, String password, double funds) {
		super();
		this.accountId = accountId;
		this.userName = userName;
		this.password = password;
		this.funds = funds;
	}




	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getFunds() {
		return funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	@Override
	public String toString() {
		return "BankAccountPojo [accountId=" + accountId + ", userName=" + userName + ", password=" + password
				+ ", funds=" + funds + "]";
	}

	

}
