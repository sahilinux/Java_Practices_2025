import java.util.Scanner;

public class J_10_Greetings {

	public static void main(String[] args) {
//	10. Write a program to display greeting in different languages using switch (EN = Hello, HI = Namaste, etc.).
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Your language:: ");
		System.out.println("En : English | Hi : Hindi | Rj : Rajasthani");
		String lang = input.next().toUpperCase();
//		System.out.println("Enter Your name: ");

		switch (lang) {
		case "EN":
			System.out.println("Hello sir, Good Morning.");
			break;
		case "HI":
			System.out.println("Namaste, Aapka din shubh ho");
			break;
		case "RJ":
			System.out.println("Ram ram sa, Padharo mhare desh...");
			break;
		default:
			System.out.println("Select a valid Language!");

		}
		input.close();

	}

}
