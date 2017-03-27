package mt1.abstractFactory.ex1;

public class MainClass {

	public static void main(String[] args) {
		GreekSaladInstructionsClient c = new GreekSaladInstructionsClient(new DicedGreekSaladInstructionFactory());
//		GreekSaladInstructionsClient c = new GreekSaladInstructionsClient(new SlicedGreekSaladInstructionFactory());
		c.printGreekSaladInstructions();
	}
	
}
