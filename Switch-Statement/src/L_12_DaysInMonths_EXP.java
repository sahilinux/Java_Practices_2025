import java.util.Scanner;

public class L_12_DaysInMonths_EXP {

	public static void main(String[] args) {
//		12. Write a program using switch expression to return number of days in a month.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number (1-12): ");
		int month = input.nextInt();

		int days = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		case 2 -> 28;
		default -> 0;
		};
		System.out.println("Number of days: " + days);
		input.close();
	}

}
