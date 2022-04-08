
public class 사용자정보 {
	private String id;
	private String 암호;
	private String 성명;
	
	public boolean 사용자등록(String id, String 암호, String 성명) {
		return true;
	}
	public boolean 사용자수정(String id, String 암호, String 성명) {
		return true;
	}
	public boolean 사용자삭제(String id) {
		return true;
	}
	public boolean 사용자id조회(String id) {
		if(id.equals("inha")) {
			return true;
		}else {
			return false;
		}
	}
}
