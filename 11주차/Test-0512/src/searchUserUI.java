public class searchUserUI {
    public static void main(String[] args) {
        User u1 = new User();
        boolean check = u1.searchUser("hong");
        System.out.println("입력 후 결과 : " + check);
    }
}
