package BankingApplication;

    class SavingsAccount extends Bank_Account {
     double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}
