class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // Example interest rate

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Error: Insufficient Funds. Savings cannot go below 0.");
        } else {
            balance -= amt;
            System.out.println("Withdrawal Successful from Savings Account.");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest Added. New Balance: " + balance);
    }
}
