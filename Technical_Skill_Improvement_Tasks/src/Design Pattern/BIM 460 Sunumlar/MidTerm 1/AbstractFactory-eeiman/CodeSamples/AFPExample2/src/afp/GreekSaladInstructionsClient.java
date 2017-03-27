package afp;


public class GreekSaladInstructionsClient {

	
	private TomatoInstructions tomatoInstructions;
	private CucumberInstructions cucumberInstructions;

	
	public GreekSaladInstructionsClient(SaladInstructionsKit factory) {
		tomatoInstructions = factory.createTomatoInstructions();
		cucumberInstructions = factory.createCucumberInstructions();	
	}
	
	
	public void printGreekSaladInstructions() {
		tomatoInstructions.printInstructions();
		cucumberInstructions.printInstructions();
	}
	
	
} // class GreekSaladInstructionsClient
