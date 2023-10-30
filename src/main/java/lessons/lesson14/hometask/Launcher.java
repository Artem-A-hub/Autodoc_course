package lessons.lesson14.hometask;

public class Launcher {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Счет 1", 1000.0);
        BankAccount account2 = new BankAccount("Счет 2", 500.0);
        BankAccount account3 = new BankAccount("Счет 3", -10.0);


        try {
            account1.withdraw(1200.0);
        } catch (InsufficientFundsException | NegativeBalanceException e) {
            System.err.println("Ошибка: Недостаточно средств на счете.");
        }


        try {
            account3.withdraw(100.0);
        } catch (NegativeBalanceException | InsufficientFundsException e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");
        }

        account2.deposit(300.0);
        account1.transferTo(account2, 800.0);
        System.out.println("Баланс счета 1: " + account1.getBalance());
        System.out.println("Баланс счета 2: " + account2.getBalance());
    }
}
