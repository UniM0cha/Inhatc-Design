public class User {
    public boolean searchUser(String id) {
        if (id.equals("hong") || id.equals("lee")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addUser(String id, String pw, String name) {
        boolean checkUser = this.searchUser(id);
        if (checkUser) {
            return true;
        } else {
            return false;
        }
    }

}
