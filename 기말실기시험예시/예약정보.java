import java.sql.*;

public class 예약정보 {
	String reservation_id;

	public boolean 예약(String id, String 객실번호, int 숙박일) {
		사용자정보 u1 = new 사용자정보();
		객실정보 r1 = new 객실정보();
		boolean checkUser = u1.사용자조회(id);
		boolean checkRoom = r1.객실조회(객실번호);
		if (checkUser && checkRoom) {
			reservation_id = id + 객실번호;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_F", "root", "991229");
				Statement stmt = conn.createStatement();
				int reservation = stmt
						.executeUpdate("insert into reservation values ('" + reservation_id + "','" + 숙박일 + "') ");
				if (reservation == 1) {
					return true;
				} else {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}
}
