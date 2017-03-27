package mt1.abstractFactory.ex1;


/**
 * The SlicedTomatoInstructions is used to illustrate the Abstract Factory Pattern of GoF. The 
 * SlicedTomatoInstructions is created by a specific concrete factory object and is the realization of a specific 
 * product type. The client system is decoupled from the actual concrete product class, but invokes the implementation 
 * through the abstract product.
 * 
 * @author Andre Mare
 */
public class SlicedTomatoInstructions extends TomatoInstructions {
	
	public void printInstructions() {
		System.out.println("Sliced Tomato Instructions.");
		System.out.println("STEP1 : Wash the tomato gently in cool tap water and wipe dry.");
		System.out.println("STEP2 : Use a paring knife or the end of a vegetable peeler to remove the stem and core (where the stem meets the top of the tomato.");
		System.out.println("STEP3 : Place the tomato vertically on a cutting board and use a sharp knife (sharp serrated knives work best) to slice the tomato.");
	} // method printInstructions	
	
} // class SlicedTomatoInstructions
