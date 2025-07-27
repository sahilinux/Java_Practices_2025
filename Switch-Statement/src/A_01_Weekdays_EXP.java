import java.util.Scanner;

public class A_01_Weekdays_EXP {

	public static void main(String[] args) {

		// Write a program to print the day of the week using switch (1 for Monday to 7
		// for Sunday).

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the day: ");
		int day = input.nextInt();

		String d = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid Day!";
		};
		System.out.println(d);
		input.close();
	}
}
