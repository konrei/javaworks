import java.util.Random;
import java.util.Scanner;

public class sortNumbers {

	
	static Random random = new Random();
	static int temp;
			
	public static void main(String[] args) {
		
		Scanner sys = new Scanner(System.in);
		
		int length = sys.nextInt();
		
		int [] arr = generateArray(length);
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	private static void sort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	
	private static int[] generateArray(int length) {
		int arr [] = new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i] = random.nextInt(100);
		}
		
		return arr;
		
	}

}
