import java.util.Scanner;

public class C_03_VowelConst {

	public static void main(String[] args) {
// 3. Write a program to check whether a character is a vowel or consonant using switch.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any character: ");
		char ch = input.next().toLowerCase().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println(ch + " is a Vowel.");
			break;
		case 'e':
			System.out.println(ch + " is a Vowel.");
			break;
		case 'i':
			System.out.println(ch + " is a Vowel.");
			break;
		case 'o':
			System.out.println(ch + " is a Vowel.");
			break;
		case 'u':
			System.out.println(ch + " is a Vowel.");
			break;
		default:
			System.out.println(ch + " is not a Vowel!");
		}
		input.close();

	}

}
