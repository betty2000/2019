package betty;

public class Horse extends Thread {
	public Horse(String name) {
		setName(name);
	}
			
	public void run() {
	for(int i = 1; i<10000; i++);{
	System.out.println(getName()+  );
	
	}
}
	/*for(int i = 1; i<10000; i++);
	System.out.print("Horse1:"+ i );*/
}
