package mt2.momento.ex1;

/**
 * Originator Implementation
 */
public class CalculatorImp implements Calculator {

    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationToCareTaker backupLastCalculation() {

        // create a memento object used for restoring two numbers
        return new PreviousCalculationImp(firstNumber, secondNumber);
    }

    public int getCalculationResult() {

        // result is adding two numbers
        return firstNumber + secondNumber;
    }

    public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {

        this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
        this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
    }

    public void setFirstNumber(int firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {

        this.secondNumber = secondNumber;
    }
}
