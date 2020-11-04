import java.awt.Label;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class findDuplicates {

	static Random random = new Random();
	static int testedNumber;
	static int count;
	static int tmp;

	public static void main(String[] args) {

		int[] arr = generateArray(20);
		System.out.println("Array: " + Arrays.toString(arr));
		findDuplicate(arr);
	}

	private static int[] generateArray(int length) {

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(9) + 1;
		}

		return arr;
	}

	private static void findDuplicate(int[] arr) {
		HashMap<Integer, Integer> countMap = new HashMap<>();

		/* label: // break the loop from wherever I choose */ for (int i = 0; i < arr.length; i++) {

			if (!countMap.containsKey(arr[i])) {
				// break label;

				testedNumber = arr[i];

				for (int j = 0; j < arr.length; j++) {

					if (testedNumber == arr[j]) {
						count++;
					}

				}

				countMap.put(testedNumber, count);

				count = 0;
			}
		}

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is counted " + entry.getValue() + " times");
			}
		}

	}

}
