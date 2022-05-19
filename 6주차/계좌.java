
public class 계좌 {
	private String number;
	private double balance=1000;
	
	public double 입금(String id, double inMoney) {
		사용자 user = new 사용자();
		if(user.searchUser(id)) {
			this.balance += inMoney;
			System.out.println("입금이 완료되었습니다. "+this.balance);
			return this.balance;
		}else {
			System.out.println("미등록 사용자 입니다.");
			return 0;
		}
	}
	
	public double 출금(String id, double outMoney) {
		사용자 user = new 사용자();
		if(user.searchUser(id)) {
			this.balance -= outMoney;
			System.out.println("출금이 완료되었습니다. "+this.balance);
			return this.balance;
		}else {
			System.out.println("미등록 사용자 입니다.");
			return -1;
		}
	}
}











