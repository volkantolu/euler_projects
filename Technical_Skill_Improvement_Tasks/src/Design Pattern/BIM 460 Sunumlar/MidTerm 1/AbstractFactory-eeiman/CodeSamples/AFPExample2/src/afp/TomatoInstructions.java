package afp;


/**
 * The TomatoInstructions is used to illustrate the Abstract Factory Pattern of GoF. The TomatoInstructions declares 
 * the operations available for the specific product type. The implementation of the product type is delegated to the 
 * subclasses of the product type.
 * 
 * @author Andre Mare
 */
public abstract class TomatoInstructions {

	public abstract void printInstructions();
	
} // class TomatoInstructions
