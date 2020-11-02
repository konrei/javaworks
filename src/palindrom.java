import java.util.Scanner;

public class palindrom {
	
	public static String text;
	public static int textLength;
	public static int index = 1;

	public static void main(String[] args) {
		
		setUp();
		checkForPalindrom(text);
	}
	
	private static void setUp() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Text: ");
		text = input.next();
		textLength = text.length();
	}
	
	public static void checkForPalindrom(String text) {
		for (int i = 0; i < textLength; i++) {
			if (text.charAt(i) == text.charAt(textLength - index)) {
				index++;
			}	
		}
		if (index - 1 == textLength) {
			System.out.print(text + " is a palindrom string");
		} else {
			System.out.print(text + " is not a palindrom string");
		}
	}

}
