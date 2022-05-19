import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.a.BooleanValueEncoder;

public class User {

    public boolean searchUser(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_d", "root", "12345678");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users where id = '" + id + "' ");
            boolean checkUser = rs.next();
            if (checkUser) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getUserCount(String[] ids) {
        int count = 0;
        for (int i = 0; i < ids.length; i++) {
            boolean check = this.searchUser(ids[i]);
            if (check) {
                count++;
            }
        }
        return count;
    }

    public boolean addUser(String id, String pw, String name) {

        boolean checkUser = this.searchUser(id);
        if (checkUser) {
            return false;
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_d", "root", "12345678");
                Statement stmt = conn.createStatement();
                int check = stmt.executeUpdate("insert into users values('" + id + "','" + pw + "','" + name + "')");
                if (check == 1) {
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

    public boolean deleteUser(String id) {
        boolean checkUser = this.searchUser(id);
        if (checkUser) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_d", "root", "12345678");
                Statement stmt = conn.createStatement();
                int check = stmt.executeUpdate("delete * from users where id = '" + id + "'");
                if (check == 1) {
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
