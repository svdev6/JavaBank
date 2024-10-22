public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance, String pin) {
        super(accountNumber, balance, pin);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        // Lógica específica para SavingsAccount...
    }

    @Override
    public void deposit(double amount) {
        // Implementación...
    }
}
