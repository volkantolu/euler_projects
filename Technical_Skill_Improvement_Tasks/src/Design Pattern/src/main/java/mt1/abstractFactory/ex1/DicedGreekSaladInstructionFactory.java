package mt1.abstractFactory.ex1;


/**
 * The DicedGreekSaladInstructionFactory is used to illustrate the Abstract Factory Pattern of GoF. The 
 * DicedGreekSaladInstructionFactory implements the list of operations and create the concrete product objects that is 
 * associated with the specific concrete factory class.
 * 
 * @author Andre Mare
 */
public class DicedGreekSaladInstructionFactory implements SaladInstructionsKit {

	public TomatoInstructions createTomatoInstructions() {
		return new DicedTomatoInstructions();
	}

	public CucumberInstructions createCucumberInstructions() {
		return new DicedCucumberInstructions();
	}
	
} // class DicedGreekSaladInstructionFactory
