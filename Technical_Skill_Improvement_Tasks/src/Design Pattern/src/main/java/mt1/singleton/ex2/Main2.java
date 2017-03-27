package mt1.singleton.ex2;

public class Main2 {

	private static Singleton singletona, singletonb;
	
	public static void main(String[] args){

		Thread threada = new Thread() {

			@Override
			public void run() {
				singletona = Singleton.getInstance();
			}

		};
		threada.start();

		Thread threadb = new Thread() {

			@Override
			public void run() {
				singletonb = Singleton.getInstance();
			}

		};
		threadb.start();

		while (!(threada.getState() == Thread.State.TERMINATED && threadb
				.getState() == Thread.State.TERMINATED))
			;
		if(singletona == singletonb)
			System.out.println("Same Object");
		else	
			System.out.println("Different Objects");
	}

}
