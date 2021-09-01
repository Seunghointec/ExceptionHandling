package be.intecbrussel.ExceptionDivison;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		try {
			//Encloses code that has the potential to create a new exception object.
			//In the usual scenario, the code inside a try clause contains calls to methods
			//whose code can create one or more exceptions.
			Scanner keyboard = new Scanner(System.in);
			System.out.println("please enter your number");
			int num = Integer.parseInt(keyboard.next());
			System.out.println("please enter your denominator");
			int den = Integer.parseInt(keyboard.next());
			int div = num / den;
			System.out.format("%d/%d-%d", num, den, div);
			keyboard.close();
		} catch (NumberFormatException nfe) {
			//Deals with the exception, buries it, and then moves on.
			System.out.println("Invalid number");
			//System.out.println(nfe.getMessage());
			//nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("Division by o");
		}
		System.out.println("This is the end of the application");
	}
}