import java.util.Scanner;

public class K_11_DayNumber {

	public static void main(String[] args) {
//		11. Write a program using traditional switch to return day name for a number (1 = Monday, etc.).
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day number (1-7) : ");
		int day = input.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday | Mon.");
			break;
		case 2:
			System.out.println("Tuesday | Tue.");
			break;
		case 3:
			System.out.println("Wednesday | Wed.");
			break;
		case 4:
			System.out.println("Thursday | Thu.");
			break;
		case 5:
			System.out.println("Friday | Fri.");
			break;
		case 6:
			System.out.println("Saturday | Sat.");
			break;
		case 7:
			System.out.println("Sunday | Sun.");
			break;
		default:
			System.out.println("Invalid day number!");
		}
		input.close();
	}
}
