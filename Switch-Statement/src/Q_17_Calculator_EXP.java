import java.util.Scanner;

public class Q_17_Calculator_EXP {

	public static void main(String[] args) {
//	17. Write a program using switch expression to return the result of arithmetic operation (+, -, \*, /).
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double n1 = input.nextDouble();
		System.out.print("Select any operation: (+, -, *, /)");
		String op = input.next();
		System.out.print("Enter second number: ");
		double n2 = input.nextDouble();

		double result = switch (op) {
		case "+" -> n1 + n2;
		case "-" -> n1 - n2;
		case "*" -> n1 * n2;
		case "/" -> n1 / n2;
		default -> {
			System.out.println("Invalid input");
			yield 0;
		}
		};
		System.out.printf("%.1f %s %.1f = %.1f\n", n1, op, n2, result);
		input.close();

	}

}
