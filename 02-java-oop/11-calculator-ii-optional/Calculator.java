
public class Calculator {
    private ArrayList operands;
    private double OperandOne;
    private double OperandTwo;
    private String Operation;
    private Double results;

    public Calculator() {
    }

    public double getOperandOne() {
        return OperandOne;
    }

    public void setOperandOne(double operandOne) {
        this.OperandOne = operandOne;
    }

    public double getOperandTwo() {
        return OperandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.OperandTwo = operandTwo;
    }

    public String getOperation() {
        return this.Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public void performOperation() {
        if (this.Operation == "+") {
            results = OperandOne + OperandTwo;
        }
        if (this.Operation == "-") {
            results = OperandOne - OperandTwo;
        }
        if (this.Operation == "*") {
            results = OperandOne * OperandTwo;
        }
        if (this.Operation == "/") {
            results = OperandOne / OperandTwo;
        }

    }

    public Double getResults() {
        return results;
    }

}
