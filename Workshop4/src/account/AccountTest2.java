package account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] acArr=new Account[5];
		
		for(int i=1;i<6;i++) {
			acArr[i-1]=new Account("221-0101-211"+i,100000,4.5);
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(acArr[i].accountInfo());
		}
		
		for(int i=0;i<5;i++) {
			acArr[i].setInterestRate(3.7);
			System.out.println(acArr[i].accountInfo()+" 이자: "+(int)acArr[i].calculateInterest()+"원");
		}
		

	}

}
