package T8.Q2;

public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public int getNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CheckingAccount(int accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public CheckingAccount(){

    }

    public void deposit(double amount){
        balance = balance+amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount>balance){
            throw new InsufficientFundsException(balance-amount);
        }
        balance = balance-amount;
    }
}
