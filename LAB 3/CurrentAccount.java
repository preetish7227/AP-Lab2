class CurrentAccount extends BankAccount {
    private double overdraftLimit = 1000.0; // Example overdraft limit

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amt) {
        if (amt > balance + overdraftLimit) {
            System.out.println("Error: Overdraft limit exceeded.");
        } else {
            balance -= amt;
            System.out.println("Withdrawal Successful from Current Account.");
        }
    }
}
