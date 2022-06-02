public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        // Payment payment = new Payment();
        CreditCard creditCard = new CreditCard();
        // Cash cash = new Cash();
        // Point point = new Point();

        order.processPay(creditCard);
        creditCard.deposit();
    }
}
