import java.util.Scanner;

public class R_18_BrowserName_EXP {

	public static void main(String[] args) {
//	18. Write a program using switch expression to return browser name from key (C = Chrome, F = Firefox, etc.).
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any character to search browser: ");
		String b = input.next().toUpperCase();

		String br = switch (b) {
		case "B" -> "Brave";
		case "C" -> "Chrome";
		case "E" -> "Edge";
		case "F" -> "Firefox";
		case "O" -> "Opera";
		default -> "Browser not found!";
		};
		System.out.println(b + " : " + br);
		input.close();
	}

}
