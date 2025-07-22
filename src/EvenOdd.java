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

		System.out.println();

		System.out.println("---------(8) Check if a person eligible for vote (age >= 18):------");
		System.out.println("Please enter your age: ");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You're eligible for vote!");
		} else {
			System.out.println("Sorry, you ain't eligible for vote!");
		}

		System.out.println();

		System.out.println("---------(9) Check if a character is an alphabet or not:------");
		System.out.println("Please enter any character: ");
		char ch1 = input.next().charAt(0);

		if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println(ch1 + " is an alphabet!");
		} else {
			System.out.println(ch1 + " is not an alphabet!");
		}

		System.out.println();

		System.out.println("---------(10) Check if a character is uppercase or lowercase.:------");
		System.out.println("Please enter any character: ");
		char ch = input.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is in upper case");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is in lower case.");
		} else {
			System.out.println(ch + " is not a valid character!");
		}

		System.out.println();

		System.out.println("---------(11) Check if a number is a multiple of 10.:------");
		System.out.println("Please enter a number: ");
		double nm = input.nextDouble();

		if (nm % 10 == 0) {
			System.out.println(nm + " is multiply by 10");
		} else {
			System.out.println(nm + " is not multiply by 10");
		}

		System.out.println();

		System.out.println("---------(12) Compare two numbers and print whether they are equal or not..:------");
		System.out.println("Please enter first number: ");
		double nm1 = input.nextDouble();

		System.out.println("Please enter second number: ");
		double nm2 = input.nextDouble();

		if (nm1 == nm2) {
			System.out.println(nm1 + "&" + nm2 + " are equal");
		} else {
			System.out.println(nm1 + "&" + nm2 + " are NOT equal");
		}

		System.out.println();

		System.out.println("---------(13) Check if a number is positive, negative, or zero.:------");
		System.out.println("Please enter any number: ");
		double x1 = input.nextDouble();

		if (x1 > 0) {
			System.out.println(x1 + " This number is Positive! (+)");
		} else if (x1 < 0) {
			System.out.println(x1 + " This number is Negative! (-)");
		} else {
			System.out.println(x1 + " This is zero (0)");
		}

		System.out.println();

		System.out.println("---------(14) Check if a student passed or failed (pass mark ≥ 35).:------");
		System.out.println("Please enter your marks: ");
		double marks = input.nextDouble();

		if (marks > 35) {
			System.out.println("You are passed!🎉");
		} else {
			System.out.println("Sorry, you are failed! 🥲");
		}

		System.out.println();

		System.out.println("---------(15) Check if a number is a single-digit number.:------");
		System.out.println("Please enter any number: ");
		double numb = input.nextDouble();

		if (numb >= 0 && numb <= 9) {
			System.out.println(numb + " is a single digit number.");
		} else {
			System.out.println(numb + " is NOT a single digit number.");
		}

		System.out.println();

		System.out.println("---------(16) Check if a number is a three-digit number.:------");
		System.out.println("Please enter any number: ");
		int numb1 = input.nextInt();

		if ((numb1 >= 100 && numb1 <= 999) || (numb1 <= -100 && numb1 >= -999)) {
			System.out.println(numb1 + " is a three-digit number.");
		} else {
			System.out.println(numb1 + " is NOT a three-digit number.");
		}

		System.out.println();

		System.out.println("---------(17) Check if the entered day number (1–7) is a weekday or weekend:------");
		System.out.println("Please enter day (1-7): ");
		int day = input.nextInt();

		if (day == 6 || day == 7) {
			System.out.println("It is Weekend!");
		} else if (day >= 1 && day <= 5) {
			System.out.println("It is Weekday!");
		} else {
			System.out.println("Day does not exist!");
		}

		System.out.println();

		System.out.println("---------(18) Check if a number is greater than 100:------");
		System.out.println("Please enter any number: ");
		int dig = input.nextInt();

		if (dig > 100) {
			System.out.println(dig + " is greater than 100");
		} else {
			System.out.println(dig + " is not greater than 100");
		}

		System.out.println();

		System.out.println(
				"---------(19) Check if a person is a child (age < 13), teenager (13–19), or adult (20+).:------");
		System.out.println("Please enter your age: ");
		int age1 = input.nextInt();

		if (age1 < 13) {
			System.out.println("You're a child.");
		} else if (age1 < 19) {
			System.out.println("You're a teenager.");
		} else {
			System.out.println("You're an adult.");
		}

		System.out.println();

		System.out.println("---------(20) Check if a character is a vowel (a, e, i, o, u).:------");
		System.out.println("Please enter any character: ");
		char ch2 = input.next().toLowerCase().charAt(0);

		if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
			System.out.println(ch2 + " is a Vowel!");
		} else {
			System.out.println(ch2 + " is NOT a Vowel!");
		}
		input.close();
	}

}
