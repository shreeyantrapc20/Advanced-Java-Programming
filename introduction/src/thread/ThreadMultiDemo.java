package thread;

public class ThreadMultiDemo  {
	
	public static void main(String []args) {
		for(int i=0; i<10; i++) {
			Thread obj1 = new Thread(new ThreadingMultiDemo());
			obj1.start();
		}
	}

	
	
}
