package betty;

public class HorseR implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<10000; i++);
		System.out.println("Horse2:"+ i );
		
	}
	
}
