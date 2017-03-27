package mt1.singleton.ex1;

public class SimpleSingleton {
	private static SimpleSingleton instance;
	public static SimpleSingleton getInstance() {
		if(instance == null)
			instance = new SimpleSingleton();
		return instance;
	}
	private SimpleSingleton()
	{
		System.out.println("Simple Singleton Constructed!");
	}
}
