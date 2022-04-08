
public class 대여정보 {
	private String 대여id;
	private int 대여일;
	private int 반납예정일;
	private int 반납일;
	
	public boolean 대여(String id, String 도서id,
			int 대여일, int 반납예정일) {
		사용자정보 u1 = new 사용자정보();
		if(u1.사용자id조회(id)) {
			도서정보 b1 = new 도서정보();
			if (b1.도서id조회(도서id)) {
				this.대여id = id + 도서id;
				this.대여일 = 대여일;
				this.반납예정일 = 반납예정일;
				System.out.println("대여가 완료되었습니다.");
				return true;
			}else {
				System.out.println("미등록 도서입니다.");
				return false;
			}
		} else {
			System.out.println("미등록 사용자입니다.");
			return false;
		}
	}
	
	public boolean 반납(String id, String 도서id, int 반납일) {
		사용자정보 u1 = new 사용자정보();
		if(u1.사용자id조회(id)) {
			도서정보 b1 = new 도서정보();
			if(b1.도서id조회(도서id)) {
				this.반납일 = 반납일;
				if (this.연체확인(반납일)) {
					System.out.println("반납이 완료되었습니다.");
				} else {
					System.out.println("연체되었습니다.");
				}
				return true;
			}else {
				System.out.println("미등록 도서입니다.");
				return false;
			}
		}else {
			System.out.println("미등록 사용자입니다.");
			return false;
		}
	}
	
	public boolean 연체확인(int 반납일) {
		if (반납일 > this.반납예정일) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
