package model;

public class BankAccountPojo {
	
	//private variables
	private String userName;
	private String password;
	private int funds;
	
	public BankAccountPojo() {
		super();
	}

	public BankAccountPojo(String userName, String password, int funds) {
		super();
		this.userName = userName;
		this.password = password;
		this.funds = funds;
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

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

	@Override
	public String toString() {
		return "BankAccountPojo [userName=" + userName + ", password=" + password + ", funds=" + funds + "]";
	}
	
	

}
