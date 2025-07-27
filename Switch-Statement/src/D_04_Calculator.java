import java.util.Scanner;

public class D_04_Calculator {

	public static void main(String[] args) {
		// 4. Write a calculator program using switch for basic operations (+, -, \*, /).
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = input.nextInt();
		System.out.println("Choose any operation (+,-,*,/): ");
		char operator = input.next().charAt(0);
		System.out.println("Enter second number: ");
		double num2 = input.nextInt();
		
		switch(operator){
		
		case '+':
			System.out.printf("Sum of %.2f & %.2f is: %.2f", num1, num2, (num1 + num2));
		case '-':
			System.out.printf("Subtraction of %.2f & %.2f is: %.2f", num1, num2, (num1 - num2));
		case '*':
			System.out.printf("Multiplication of %.2f & %.2f is: %.2f", num1, num2, (num1 * num2));
		case '/':
			System.out.printf("Division of %.2f & %.2f is: %.2f", num1, num2, (num1 / num2));
		default:
			System.out.printf("Enter a valid operation...");
		}
		input.close();
				

	}

}
