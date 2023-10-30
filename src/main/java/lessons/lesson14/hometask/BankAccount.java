package lessons.lesson14.hometask;

public class BankAccount {

    private String bill;
    private double balance;

    public BankAccount(String bill, double balance) {
        this.bill = bill;
        this.balance = balance;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double v) throws InsufficientFundsException, NegativeBalanceException {
        if(getBalance() < 0){
            throw new NegativeBalanceException();
        }else if (v > getBalance()) {
            throw new InsufficientFundsException();
        }
        setBalance(getBalance() - v);
    }

    public void deposit(double v) {
        setBalance(getBalance() + v);
    }

    public void transferTo(BankAccount account2, double v) {
        this.setBalance(getBalance() - v);
        account2.setBalance(account2.getBalance() + v);
    }
}
