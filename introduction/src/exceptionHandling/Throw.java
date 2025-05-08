package exceptionHandling;
import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		validateAge(a);
	}
	
	public static void validateAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Age: "+age+" is not valid. ");
		} else {
			System.out.println("You are eligible to vote");
		}
	}
}
