import java.util.Scanner;

public class N_14_ShapeName_EXP {

	public static void main(String[] args) {
//	14. Write a program using switch expression to return shape name (1 = Circle, 2 = Square, etc.).
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number for Shape: ");
		int nm = input.nextInt();

		String sh = switch (nm) {
		case 1 -> "Circle";
		case 2 -> "Triangle";
		case 3 -> "Square";
		case 4 -> "Rectangle";
		case 5 -> "Hexagon";
		default -> "There are only 5 Shapes available!";
		};
		System.out.println(nm + " No. Shape is : " + sh);
		input.close();
	}

}
