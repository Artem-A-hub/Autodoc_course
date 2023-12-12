package lesson30.calculator;

public class Calculator {

    private IOperation iOperation;

    public Calculator (IOperation iOperation) {
        this.iOperation = iOperation;
    }

    public void setIOperation(IOperation iOperation) {
        this.iOperation = iOperation;
    }

    public double performOperation(double value1, double value2) {
        return iOperation.operation(value1, value2);
    }
}