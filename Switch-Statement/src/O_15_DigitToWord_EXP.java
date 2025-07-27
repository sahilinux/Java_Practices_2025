import java.util.Scanner;

public class O_15_DigitToWord_EXP {

	public static void main(String[] args) {
//	15. Write a program using switch expression to convert digit to word (0 = Zero, 1 = One, etc.).
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any digit you want convert into word : ");
		int dig = input.nextInt();

		String wd = switch (dig) {
		case 0 -> "Zero";
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> "Three";
		case 4 -> "Four";
		case 5 -> "Five";
		case 6 -> "Six";
		case 7 -> "Seven";
		case 8 -> "Eight";
		case 9 -> "Nine";
		default -> "Oops! Something went wrong!";
		};
		System.out.println(dig + " : " + wd);
		input.close();
	}
}
