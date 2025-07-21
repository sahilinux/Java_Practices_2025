import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("---------(1) Check if a number is even or odd:------");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		double x = input.nextDouble();

		if (x % 2 == 0) {
			System.out.println("This is a Even Number!");
		} else {
			System.out.println("This is a Odd Number!");
		}
		System.out.println();

		System.out.println("---------(2) Check if a number is Positive or Negative:------");
		System.out.println("Enter a number");
		double pn = input.nextDouble();

		if (pn >= 0) {
			System.out.println("The number is Positive! (+)");
		} else {
			System.out.println("The number is Negative! (-)");
		}

		System.out.println();

		System.out.println("---------(3) Check if a number is Zero (0):------");
		System.out.println("Enter a number");
		double z = input.nextDouble();

		if (z == 0) {
			System.out.println("This is Zero (0)");
		} else {
			System.out.println("This is NOT a Zero (0)");
		}
		
		System.out.println();

		System.out.println("---------(4) Find bigger number between two numbers:------");
		System.out.println("Enter first number");
		double n1 = input.nextDouble();
		
		System.out.println("Enter second number");
		double n2 = input.nextDouble();
		
		if (n1 > n2) {
			System.out.println("The bigger number is n1 " + n1);
		} else {
			System.out.println("The bigger number is n2 " + n2);
		}
		
		System.out.println();

		System.out.println("---------(5) Find Smaller number between two numbers:------");
		System.out.println("Enter first number");
		double s1 = input.nextDouble();
		
		System.out.println("Enter second number");
		double s2 = input.nextDouble();
		
		if (s1 < s2) {
			System.out.println("The Smaller number is s1 " + s1);
		} else {
			System.out.println("The Smaller number is s2 " + s2);
		}
		
		System.out.println();

		System.out.println("---------(6) Check if a number divisible by 2:------");
		System.out.println("Enter any number: ");
		long d = input.nextLong();
		
		if (d % 2 == 0) {
			System.err.println("The number is Divisible by 2");
		} else {
			System.out.println("The number is NOT divisible by 2");
		}
		
		System.out.println();

		System.out.println("---------(7) Check if a number divisible by 3 & 5:------");
		System.out.println("Enter any number: ");
		long e = input.nextLong();
		
		if (e % 3 == 0 && e % 5 == 0) {
			System.err.println("The number is Divisible by 3 & 5");
		} else {
			System.out.println("The number is NOT divisible by 3 & 5");
		}
		
		
		input.close();
	}

}
