package afp;


/**
 * The DicedTomatoInstructions is used to illustrate the Abstract Factory Pattern of GoF. The 
 * DicedTomatoInstructions is created by a specific concrete factory object and is the realization of a specific 
 * product type. The client system is decoupled from the actual concrete product class, but invokes the implementation 
 * through the abstract product.
 * 
 * @author Andre Mare
 */
public class DicedTomatoInstructions extends TomatoInstructions {

	public void printInstructions() {
		System.out.println("Diced Tomato Instructions.");
		System.out.println("STEP1 : Cut it in quarters vertically, through the stem.");
		System.out.println("STEP2 : Cut away the inner pulpy part of each tomato quarter, cutting away the stem with it.");
		System.out.println("STEP3 : Slice the remaining outer flesh into thin strips, then cut the strips crosswise into a dice.");
	} // method printInstructions
	
} // class DicedTomatoInstructions
