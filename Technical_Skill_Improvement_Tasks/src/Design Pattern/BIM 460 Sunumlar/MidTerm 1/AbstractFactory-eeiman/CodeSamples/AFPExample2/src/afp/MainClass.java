package afp;

public class MainClass {

	public static void main(String[] args) {
		GreekSaladInstructionsClient c = new GreekSaladInstructionsClient(new DicedGreekSaladInstructionFactory());
//		GreekSaladInstructionsClient c = new GreekSaladInstructionsClient(new SlicedGreekSaladInstructionFactory());
		c.printGreekSaladInstructions();
	}
	
}
