
public class 예약시스템UI {

	public static void main(String[] args) {
		예약정보 r1 = new 예약정보();
		boolean reservation = r1.예약("hong", "1", 20220506);
		if (reservation) {
			System.out.println("예약 완료");
		} else {
			System.out.println("예약 안됨");
		}

	}

}
