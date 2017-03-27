package mt1.singleton.ex2;

public class Singleton {
	private static Singleton theInstance;


	public static synchronized Singleton getInstance() {

		if (theInstance == null) {
			theInstance = new Singleton();
		}
		return theInstance;
	}

	private Singleton() {
		
		System.out.println("Inside the constructor!");


		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
