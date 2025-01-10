package BankingApplication;

public class BankingSystem {
    // Main class to demonstrate polymorphism
        public static void main(String[] args) {
            Bank_Account savings = new SavingsAccount("SA12345", 1000.0, 5.0);
            savings.displayAccountType();
            savings.deposit(500.0);
            savings.withdraw(300.0);
            ((SavingsAccount) savings).addInterest();
            System.out.println("Balance after adding interest: " + savings.getBalance());

            Bank_Account current = new CurrentAccount("CA123w45", 400.0, 1000.0);
            current.displayAccountType();
            current.deposit(1000.0);
            current.withdraw(1800.0);  // Using overdraft
            System.out.println("Final balance: " + current.getBalance());
        }
    }

