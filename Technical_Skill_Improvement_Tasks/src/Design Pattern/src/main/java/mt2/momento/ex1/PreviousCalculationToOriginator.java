package mt2.momento.ex1;

/**
 * Memento Interface to Originator
 * <p/>
 * This interface allows the originator to restore its state
 */

public interface PreviousCalculationToOriginator {

    public int getFirstNumber();

    public int getSecondNumber();
}
