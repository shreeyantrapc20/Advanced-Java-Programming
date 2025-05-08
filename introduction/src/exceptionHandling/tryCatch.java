package exceptionHandling;

public class tryCatch {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 5;
		int x;
		
		try {
			x = a/(b-c);
		} catch(Exception e) {
			System.out.println("Exception: "+e);
		} finally {
			System.out.println("Program executed");
		}
		
	}
	
}
