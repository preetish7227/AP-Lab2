abstract class BankAccount {
    protected String accNo;
    protected double balance;

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public abstract void withdraw(double amt);

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit Successful. New Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
}
