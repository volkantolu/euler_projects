package afp;


/**
 * The SaladInstructionsKit is used to illustrate the Abstract Factory Pattern of GoF. The SaladInstructionsKit 
 * defines a factory type that list operations for creating the set of related abstract product types.
 * 
 * @author Andre Mare
 */
public interface SaladInstructionsKit {

	
	public TomatoInstructions createTomatoInstructions();
	
	
	public CucumberInstructions createCucumberInstructions();
	
		
} // class SaladInstructionsKit
