package BankingApplication;

public class VirajBankAccount {

    private String accountno;
    private double balance;

    public VirajBankAccount(String accountno, double initialbalance) {
        this.accountno = accountno;
        this.balance = initialbalance;
    }

    public VirajBankAccount() {

    }
    public String enter_account_no(String accountno){

        System.out.println(accountno);
        return accountno;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " Rs");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " Rs");
        } else {
            System.out.println("Insufficient balance or invalid amount.");

        }

    }

    public double get_balance() {
        System.out.println("Cuurent balance is "+ balance);
        return balance;
    }
}
