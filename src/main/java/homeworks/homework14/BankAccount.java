package homeworks.homework14;

public class BankAccount {

    private String nameOfAccount;
    private double balance;

    public BankAccount() {

    }

    public double withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException {
        if (this.balance < 0) {
            throw new NegativeBalanceException(this.balance, "\nОшибка: Отрицательный баланс не допускается.");
        } else if (this.balance < amount) {
            throw new InsufficientFundsException(this.balance, amount, "\nОшибка: Недостаточно средств на счете.");
        }
        return this.balance -= amount;
    }

    public double deposit(double amount) throws NegativeBalanceException {
        if (amount < 0) {
            throw new NegativeBalanceException(amount, "\nОшибка: Невозможно положить отрицательную сумму на счет.");
        }
        return this.balance += amount;
    }

    public double transferTo(BankAccount account, double amount) throws InsufficientFundsException, NegativeBalanceException {
        if (this.balance < 0) {
            throw new NegativeBalanceException(this.balance, "\nОшибка: Отрицательный баланс не допускается.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException(this.balance, amount, "\nОшибка: Недостаточно средств на счете для перевода.");
        }
        this.balance -= amount;
        return account.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNameOfAccount() {
        return this.nameOfAccount;
    }

    public void informationAboutBalanceAccount() {
        System.out.println(getNameOfAccount() + " баланс: " + getBalance());
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNameOfAccount(String nameOfAccount) {
        this.nameOfAccount = nameOfAccount;
    }
}
