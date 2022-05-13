public class transferUI {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        double result = a1.transfer("hong", "lee", 1000);
        System.out.println(result);
    }
}
