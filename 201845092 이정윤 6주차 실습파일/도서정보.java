
public class 도서정보 {
	private String 도서id;
	private String 도서명;
	private String 출판사;
	
	public boolean 도서등록(String 도서id, String 도서명, String 출판사) {
		return true;
	}
	public boolean 도서수정(String 도서id, String 도서명, String 출판사) {
		return true;
	}
	public boolean 도서삭제(String 도서id) {
		return true;
	}
	public boolean 도서id조회(String 도서id) {
		if(도서id.equals("book001")) {
			return true;
		}else {
			return false;
		}
	}
}
