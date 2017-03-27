package mt2.momento.ex1;

/**
 * Memento Object Implementation
 * <p/>
 * Note that this object implements both interfaces to Originator and CareTaker
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
        PreviousCalculationToOriginator {

    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {

        return firstNumber;
    }

    public int getSecondNumber() {

        return secondNumber;
    }
}
