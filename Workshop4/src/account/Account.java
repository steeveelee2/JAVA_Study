package account;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account,int balance,double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	
	public void setAccount(String account) {
		this.account=account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getBalnce() {
		return balance;
	}
	
	public double calculateInterest() {
		return balance/100*interestRate;
	}
	
	public void deposit(int money) {
		this.balance+=money;		
	}
	
	public void withdraw(int money) {
		this.balance-=money;
	}
	
	public String accountInfo() {
		return "계좌번호: "+account+" 잔액: "+balance+"원 이자율: "+interestRate+"%%";
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	

	
}
