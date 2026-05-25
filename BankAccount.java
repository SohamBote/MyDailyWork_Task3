public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
