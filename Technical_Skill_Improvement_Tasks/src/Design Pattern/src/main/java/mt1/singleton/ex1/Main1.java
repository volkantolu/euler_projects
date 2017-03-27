package mt1.singleton.ex1;

public class Main1 {
private static SimpleSingleton singletona, singletonb;
	
	public static void main(String[] args) {
		singletona = SimpleSingleton.getInstance();
		singletonb = SimpleSingleton.getInstance();
		
		//singletonb.clone();
		if(singletona == singletonb)
			System.out.println("Same Object");
		else
			System.out.println("Different Objects");
	}
}
