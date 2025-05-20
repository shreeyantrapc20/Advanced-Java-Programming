package thread;


public class ThreadingMultiDemo implements Runnable {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch(Exception e){
			System.out.println("Caught the exception");
		}
	}
}
