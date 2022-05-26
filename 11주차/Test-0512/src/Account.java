public class Account {
    private String number;
    private double balance = 10000;

    public double deposit(String id, double inMoney) {
        User u1 = new User();
        u1.searchUser(id);
        boolean checkUser = u1.searchUser(id);

        if (checkUser) {
            balance += inMoney;
            return balance;
        } else {
            return -1;
        }
    }

    public double withdraw(String id, double inMoney) {
        User u1 = new User();
        boolean checkUser = u1.searchUser(id);

        if (checkUser) {
            if (balance - inMoney < 0) {
                return -1;
            } else {
                balance -= inMoney;
                return balance;
            }
        } else {
            return -1;
        }
    }

    public double transfer(String id, String transferId, double transferMoney) {
        User u1 = new User();
        boolean checkUser = u1.searchUser(id);
        if (checkUser) {
            if (this.balance >= transferMoney) {
                Account a2 = new Account();
                a2.deposit(transferId, transferMoney);
                this.withdraw(id, transferMoney);
                return this.balance;
            }
            return -1;
        } else {
            return -1;
        }

    }
}
