package controlStatement;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		int b = 30;
		
		if(b<40) {
			System.out.println("Number is less than 40");
		}
		
		int c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c: ");
		c = sc.nextInt();
		System.out.println("Enter the value of d: ");
		d = sc.nextInt();
		
		int e = c+d;
		
		if(e>b) {
			System.out.println("The sum "+e+" is greater than b "+b);
		} else {
			System.out.println("The sum "+e+" is less than b "+b);
		}
		
		
		
	}
	
}
