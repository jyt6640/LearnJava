package ch06;

public class Account {
    int balance;
    public static int MIN_BALANCE = 0;
    public static int MAX_BALANCE = 1000000;

    void setBalance(int balance) {
        if (this.balance < MIN_BALANCE) {
            this.balance = MIN_BALANCE;
        } else if (this.balance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        } else {
            this.balance = balance;
        }
    }

    int getBalance() {
        return this.balance;
    }
}
