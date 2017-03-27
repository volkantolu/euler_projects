package afp;


/**
 * The DicedCucumberInstructions is used to illustrate the Abstract Factory Pattern of GoF. The 
 * DicedCucumberInstructions is created by a specific concrete factory object and is the realization of a specific 
 * product type. The client system is decoupled from the actual concrete product class, but invokes the implementation 
 * through the abstract product.
 * 
 * @author Andre Mare
 */
public class DicedCucumberInstructions extends CucumberInstructions {
	
	public void printInstructions() {
		System.out.println("Diced Cucumber Instructions.");
		System.out.println("STEP1 : Peel the skin with a vegetable peeler and slice the cucumber in half lengthwise.");
		System.out.println("STEP2 : Using a teaspoon, scrape the seeds and pulpy interior from each half.");
		System.out.println("STEP3 : Slice into thin strips and then cut crosswise to dice.");
	} // method printInstructions	
	
} // class DicedCucumberInstructions
