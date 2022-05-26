import java.sql.*;

public class 사용자정보 {
	public boolean 사용자조회(String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_F", "root", "991229");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(" select * from user where id = '" + id + "' ");
			boolean checkId = rs.next();
			if (checkId) {
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
