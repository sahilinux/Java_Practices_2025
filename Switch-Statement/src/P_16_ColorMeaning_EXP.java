import java.util.Scanner;

public class P_16_ColorMeaning_EXP {

	public static void main(String[] args) {
//	16. Write a program using switch expression to return color meaning (R = Red, G = Green, etc.).
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any character to get Color (A to Z) : ");
		char c = input.next().toUpperCase().charAt(0);
		
		String cl = switch(c) {
		case 'A' -> "Amber";
		case 'B' -> "Blue";
		case 'C' -> "Crimson";
		case 'D' -> "Denim";
		case 'E' -> "Emerald";
		case 'F' -> "Fuchsia";
		case 'G' -> "Green";
		case 'H' -> "Hot Pink";
		case 'I' -> "Indigo";
		case 'J' -> "Jade";
		case 'K' -> "Khaki";
		case 'L' -> "Lavender";
		case 'M' -> "Magenta";
		case 'N' -> "Navy";
		case 'O' -> "Orange";
		case 'P' -> "Pink";
		case 'Q' -> "Quartz";
		case 'R' -> "Red";
		case 'S' -> "Silver";
		case 'T' -> "Turquoise";
		case 'U' -> "Ultramarine";
		case 'V' -> "Violet";
		case 'W' -> "White";
		case 'X' -> "Xanadu";
		case 'Y' -> "Yellow";
		case 'Z' -> "Zaffre";
		default -> "Not a valid input!";
		};
		
		System.out.println(c + " : " + cl);
		input.close();
		
	}

}
