import java.util.Scanner;


public class I_09_PassOrFail {

	public static void main(String[] args) {
//		9. Write a program to print "Pass" or "Fail" using switch based on marks.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = input.nextInt();
		
		switch(marks / 10) {
		case 4,5,6,7,8,9,10:
			System.out.println("You are PASS!");
			break;
		case 3,2,1:
			System.out.println("You are FAILED!");		
			break;
		default:
			System.out.println("Something went wrong!");
		}
		input.close();
	}

}
