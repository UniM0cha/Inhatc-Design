public class User {
    private String id;
    private String pw;
    private String name;

    public boolean addUser(String id, String pw, String name) {
        boolean checkUser = this.searchUser(id);
        if (checkUser) {
            System.out.println("등록되었습니다.");
            return true;
        } else {
            System.out.println("등록되지 않았습니다.");
            return false;
        }
    }

    public boolean 수정(String id, String pw, String name) {
        return true;
    }

    public boolean deleteUser(String id) {
        return true;
    }

    public boolean searchUser(String id) {
        if (id.equals("inha")) {
            return true;
        } else {
            return false;
        }
    }

}
