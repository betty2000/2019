package betty;

import java.util.concurrent.ThreadLocalRandom;

public class H1 {

	public static void main(String[] args) {
		Horse h1 = new Horse("H1"); 
		h1.start();
		Horse h2 = new Horse("H2");
		h2.start();
				
	}

}
//

/*HorseR  h1 = new HorseR();
Thread t = new Thread(h1);
t.start();
System.out.println("main end");*/
