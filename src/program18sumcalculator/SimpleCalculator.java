package program18sumcalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getsecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getsecondNumber();
    }

    public double getSubtractionResult() {
        double result = getAdditionResult() - getsecondNumber();
        return result;
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getsecondNumber();


    }

    public double getDivisionResult() {
        if (secondNumber == 0 || firstNumber == 0) {
            return 0;
        }
        return getFirstNumber() / getsecondNumber();
    }


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


}
