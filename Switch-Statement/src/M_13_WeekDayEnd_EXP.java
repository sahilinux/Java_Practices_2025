import java.util.Scanner;

public class M_13_WeekDayEnd_EXP {

	public static void main(String[] args) {
//	13. Write a program using switch expression to return "Weekday" or "Weekend" for given day.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day number (1-7): ");
		int day = input.nextInt();
		
		String dayName = switch(day){
		case 1, 2, 3, 4, 5 -> "Weekday!";
		case 6, 7 -> "Weekend!";
		default -> "Invalid day!";
		};
		System.out.println("This is a : " + dayName);
		input.close();
	}

}
