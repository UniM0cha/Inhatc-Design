
public class ���� {
	private String number;
	private double balance=1000;
	
	public double �Ա�(String id, double inMoney) {
		����� user = new �����();
		if(user.searchUser(id)) {
			this.balance += inMoney;
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. "+this.balance);
			return this.balance;
		}else {
			System.out.println("�̵�� ����� �Դϴ�.");
			return 0;
		}
	}
	
	public double ���(String id, double outMoney) {
		����� user = new �����();
		if(user.searchUser(id)) {
			this.balance -= outMoney;
			System.out.println("����� �Ϸ�Ǿ����ϴ�. "+this.balance);
			return this.balance;
		}else {
			System.out.println("�̵�� ����� �Դϴ�.");
			return -1;
		}
	}
}











