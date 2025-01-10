package BankingApplication;

public class VirajBankingMain extends VirajBankAccount {

    public VirajBankingMain(String accountno, double initialbalance) {
        super(accountno, initialbalance);
    }

    public VirajBankingMain() {
        super();
    }

    public static void main(String[] args) {

        VirajBankingMain vir = new VirajBankingMain();
        vir.enter_account_no("Viraj12!#");
        vir.get_balance();

        vir.deposit(5);
        vir.withdraw(45);
        vir.get_balance();
    }
}
