import java.util.Scanner;

public class F_06_TrafficSignal {

	public static void main(String[] args) {
//		Write a program to display traffic signal meaning using switch (Red = Stop, etc.).
		Scanner input = new Scanner(System.in);
		System.out.println("Enter signal light: ");
		String light = input.next().toLowerCase();
		
		switch(light) {
		case "red":
			System.out.println("STOP");
			break;
		case "yellow":
			System.out.println("Wait");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid signal light");
		}
		input.close();
	}

}
