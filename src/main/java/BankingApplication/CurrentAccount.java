package BankingApplication;


    class CurrentAccount extends Bank_Account {
        private double overdraftLimit;

        public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
            super(accountNumber, initialBalance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
                double balance = getBalance();
                if (amount <= balance) {
                    super.withdraw(amount);
                } else {
                    System.out.println("Using overdraft.");
                    super.withdraw(balance);
                    System.out.println("Overdraft used: " + (amount - balance));
                }
            } else {
                System.out.println("Exceeded overdraft limit or invalid amount.");
            }
        }

        @Override
        public void displayAccountType() {
            System.out.println("This is a Current Account.");
        }
    }

