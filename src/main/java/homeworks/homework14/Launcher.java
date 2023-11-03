package homeworks.homework14;

public class Launcher {
    public static void main(String[] args) throws NegativeBalanceException, InsufficientFundsException {
        BankAccount account1 = new BankAccount();
        account1.setNameOfAccount("Счет 1");
        account1.setBalance(1000.0);
        BankAccount account2 = new BankAccount();
        account2.setNameOfAccount("Счет 2");
        account2.setBalance(500.0);
        BankAccount account3 = new BankAccount();
        account3.setNameOfAccount("Счет 3");
        account3.setBalance(-10.0);


        try {
            account1.withdraw(1200.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            account3.withdraw(100.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        account2.deposit(300.0);
        account1.transferTo(account2, 800.0);
        account1.informationAboutBalanceAccount();
        account2.informationAboutBalanceAccount();
    }
}
