package controlStatement;
import java.util.Scanner;
public class Loops {

	public static void main(String args[]) {
		
		int choice = 0;
		
		do {
			for(int i = 0; i<=10; i++) {
				
				for(int j = 1; j<=i-1; j++) {
					
					System.out.print(j+" ");
				}
				
				System.out.println("");
			}
			
			int a = 1;
			
			while(a<=10) {
				
				System.out.println("5 * "+a+" = "+(5*a));
				
				a++;
			}
			
			System.out.println("Do you want to run again?: Enter 1 for yes");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
		} while(choice == 1);
	
	
}
}
