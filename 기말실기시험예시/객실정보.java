import java.sql.*;

public class 객실정보 {
	public boolean 객실조회(String 객실번호) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_F", "root", "991229");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(" select * from Room where room_number = '" + 객실번호 + "' ");
			boolean checkroom = rs.next();
			if (checkroom) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
