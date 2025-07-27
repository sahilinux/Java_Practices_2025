import java.util.Scanner;

public class G_07_SeasonNames {

	public static void main(String[] args) {
//		Write a program to print season name for a given month number using switch.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month number (1-12) : ");
		int month = input.nextInt();

		switch (month) {
		case 12, 1, 2:
			System.out.println("------> It's Winter Season <------");
			break;
		case 3, 4, 5:
			System.out.println("------> It's Spring Season <------");
			break;
		case 6, 7, 8:
			System.out.println("------> It's Summer Season <------");
			break;
		case 9, 10, 11:
			System.out.println("------> It's Automn Season <------");
			break;
		default:
			System.out.println("Invalid input, please try: (1 - 12)");
		}
		input.close();
	}

}
