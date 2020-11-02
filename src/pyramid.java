import java.util.Scanner;

public class pyramid {
	
	public static int input;

	public static void main(String[] args) {
		setUp();
		createPyramid(input);
	}
	
	private static void setUp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nol: ");
		input = scanner.nextInt();
	}
	private static void createPyramid(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print(" ".repeat(input - i));
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
