import java.util.Scanner;

public class E_05_Grade {

	public static void main(String[] args) {
		// 5. Write a program to print grade description using switch (A = Excellent, B
		// = Good, etc.).
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade (A/B/C/D/E): ");
		char grade = input.next().toUpperCase().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println(":::EXCELLENT:::   You got A GRADE!");
			break;
		case 'B':
			System.out.println("::: GOOD :::      You got B GRADE!");
			break;
		case 'C':
			System.out.println("::: AVERAGE :::   You got C GRADE!");
			break;
		case 'D':
			System.out.println("::: NOT GOOD :::  You got D GRADE!");
			break;
		case 'E':
			System.out.println("::: NEED MORE PRACTICE:::  You got E GRADE!");
			break;
		default:
			System.out.println("Invalid input!");
		}
		input.close();
	}

}
