package afp;


/**
 * The SlicedCucumberInstructions is used to illustrate the Abstract Factory Pattern of GoF. The 
 * SlicedCucumberInstructions is created by a specific concrete factory object and is the realization of a specific 
 * product type. The client system is decoupled from the actual concrete product class, but invokes the implementation 
 * through the abstract product.
 * 
 * @author Andre Mare
 */
public class SlicedCucumberInstructions extends CucumberInstructions {

	public void printInstructions() {
		System.out.println("Sliced Cucumber Instructions.");
		System.out.println("STEP1 : Wash the cucumber gently in cool tap water and wipe dry.");
		System.out.println("STEP2 : Place the cucumber vertically on a cutting board.");
		System.out.println("STEP3 : Use a sharp knife (sharp serrated knives work best) to slice the cucumber.");
	} // method printInstructions	
	
} // class SlicedCucumberInstructions
