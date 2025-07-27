import java.util.Scanner;

public class H_08_EvenOdd {

	public static void main(String[] args) {
//		8 Write a program to check whether a number is even or odd using switch.
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int n = input.nextInt();

		switch (n % 2) {
		case 0:
			System.out.println(n + " is a Even Number.");
			break;
		case 1:
			System.out.println(n + " is a Odd Number.");
			break;
		default:
			System.out.println("Something went wrong!");
		}
		input.close();
	}

}
