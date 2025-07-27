import java.util.Scanner;

public class T_20_CountryCode_EXP {

	public static void main(String[] args) {
//	20. Write a program using switch expression to return continent name from country 
//  code (IN = Asia, US = North America, etc.).
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any country code to search country: \n");
		String cc = input.next().toUpperCase();

		String cn = switch (cc) {
		case "IN" -> "Asia";
		case "US" -> "North America";
		case "BR" -> "South America";
		case "DE" -> "Europe";
		case "ZA" -> "Africa";
		case "AU" -> "Australia"; 
		default -> null;
		};
		if (cn != null) {
            System.out.println("------: CONTINENT FOUND :------\n");
            System.out.println(cc + " : " + cn);
        } else {
            System.out.println(cc + " : Country not available in list!");
        }
		input.close();
	}
}
