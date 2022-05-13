public class addUserUI {
    public static void main(String[] args) {
        User u1 = new User();
        boolean check = u1.addUser("hong", "1234", "KIM");
        System.out.println("입력 후 결과 : " + check);
    }
}