package afp;

/**
 * The CucumberInstructions is used to illustrate the Abstract Factory Pattern of GoF. The CucumberInstructions declares 
 * the operations available for the specific product type. The implementation of the product type is delegated to the 
 * subclasses of the product type.
 * 
 * @author Andre Mare
 */
public abstract class CucumberInstructions {

	public abstract void printInstructions();
	
} // class CucumberInstructions
