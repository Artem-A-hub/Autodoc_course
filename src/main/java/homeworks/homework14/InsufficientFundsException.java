package homeworks.homework14;

public class InsufficientFundsException extends Exception {

    private double sum;
    private double amount;

    public InsufficientFundsException(double details, double amount, String message) {
        super(message);
        this.sum = details;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "InsufficientFundsException{" + " Сумма снятия: " + amount +
                " превышает ваш баланс: " + sum + " " +
                getMessage() +
                '}';
    }
}
