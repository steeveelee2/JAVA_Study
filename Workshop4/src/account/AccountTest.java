package account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account=new Account("441-0290-1203",500000,7.3);
		
		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalnce());
		
		account.deposit(20000);
		
		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalnce());
		
		System.out.println("이자: "+account.calculateInterest());

	}

}
