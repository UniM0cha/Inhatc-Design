
public class User {
	private String id;
	private String pw;
	private String name;
	
	
	public boolean addUser(String id, String pw, String name) {
		boolean check = this.searchUser(id); //UCD 에서 searchUser를 Include 하고 있기 때문에 this 사용, boolean형의 check 변수에 담는다고 했으니 boolean check 선언
		return check; //check로 return 받기로 했으니까 return check
	}
	

	public boolean updateUser(String id, String pw, String name) {
		boolean check = this.searchUser(id); 
		return check; 
	}

	public boolean deleteUser(String id) {
		boolean check = this.searchUser(id); 
		return check; 
	}

	public boolean searchUser(String id) {
		return true;
	}

}
