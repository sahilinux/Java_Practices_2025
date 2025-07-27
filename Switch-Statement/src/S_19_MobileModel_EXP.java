import java.util.Scanner;

public class S_19_MobileModel_EXP {

	public static void main(String[] args) {
//	19. Write a program using switch expression to return mobile brand from model code.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Mobile Model no. to find Mobile Brand: ");
		String cd = input.next().toUpperCase();

		String mb = switch (cd) {
		case "SMS92" -> "Samsung – Galaxy S25 Ultra";
		case "A2962" -> "Apple – iPhone 16 Pro Max";
		case "N30G" -> "Xiaomi – 15 Ultra";
		case "PHB10" -> "OnePlus – OnePlus 13";
		case "GNVW0" -> "Google – Pixel 9 Pro";
		default -> "Model not found!";
		};
		System.out.println("------ Mobile Found : ------");
		System.out.println(cd + " : " + mb);
		input.close();
	}

}
