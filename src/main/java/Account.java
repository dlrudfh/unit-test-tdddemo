public class Account {
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int withdraw(int money) {
        if (money > this.balance)
            return this.balance;
        else {
            this.balance -= money;
            return this.balance;
        }
    }
}
