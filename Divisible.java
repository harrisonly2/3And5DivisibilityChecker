import java.util.Scanner;

public class Divisible {
	
	public static void divisBy3and5() {
		
		/** Scanner to receive input */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer: ");
		/** Check for valid input, prints error message if invalid */
		while (!sc.hasNextInt()) {
			System.out.println("Try again! Please enter a valid integer: ");
			sc.nextLine();
		}
		int a = sc.nextInt();
		
		/** Checks divisibility of number by 3 and 5 and prints out corresponding message */
		if (a % 5 == 0 && a % 3 == 0) {
			System.out.println("MustangBronco");
		} else if (a % 5 == 0) {
			System.out.println("Bronco");
		} else if (a % 3 == 0) {
			System.out.println("Mustang");
		} else {
			System.out.println(a);
		}
		sc.close();
	}

	public static void main(String[] args) {
		divisBy3and5();
	}
}
