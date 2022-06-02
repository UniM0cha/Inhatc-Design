public class CreditCard extends Payment implements Bank {
    public void pay() {
        System.out.println("신용카드 지불 : CreditCard.pay()");
    }

    @Override
    public void deposit() {
        System.out.println("신용카드 지불 : CreditCard.deposit()");
    }
}
