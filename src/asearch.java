import java.util.Scanner;

public class asearch {

	static String sentence;
	static int aCount;
	static String newSentence;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		sentence = input.next();

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 'a') {
				aCount++;
			}

		}

		System.out.println(sentence.replace('a', 'b'));
	}

}
