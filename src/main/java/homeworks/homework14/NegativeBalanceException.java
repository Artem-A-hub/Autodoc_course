package homeworks.homework14;

public class NegativeBalanceException extends Exception{

    private double sum;

    public NegativeBalanceException(double details, String message) {
        super(message);
        this.sum = details;

    }

    @Override
    public String toString() {
        return "NegativeBalanceException{" +
                "Сумма вашего баланса = " + sum + " " +
                getMessage() +
                '}';
    }
}
