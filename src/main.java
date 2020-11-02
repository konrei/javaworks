import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static String operation;

	static int base;
	static int height;
	static int side;
	static int radius;
	static int width;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Car car = new Car();

		car.setName("honda");
		car.setModel("sedan");

		Car car2 = new Car();
		car2.setModel("hetchback");
		car2.setName("toyota");

		ArrayList<Car> cars = new ArrayList<>();

		cars.add(car);
		cars.add(car2);

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).getName());
		}

		while (true) {
			System.out.print("(T)riangle, (S)quare, (C)ircle, (R)ectangle or (e)xit > ");
			operation = input.next();

			if (operation.equals("e"))
				break;

			switch (operation) {
			case "T":
				System.out.print("Base: ");
				base = input.nextInt();

				System.out.print("Height: ");
				height = input.nextInt();

				System.out.println("Result: " + areaOfTriangle(base, height));
				break;
			case "S":
				System.out.print("Side: ");
				side = input.nextInt();

				System.out.println("Result: " + areaOfSquare(side));
				break;
			case "C":
				System.out.print("Radius: ");
				radius = input.nextInt();

				System.out.println("Result: " + areaOfCircle(radius));
				break;
			case "R":
				System.out.print("Width: ");
				width = input.nextInt();

				System.out.print("Height: ");
				height = input.nextInt();

				System.out.println("Result: " + areaOfRectangle(width, height));
				break;
			}
		}

	}

	private static int areaOfTriangle(int base, int height) {
		int result = (base * height) / 2;
		return result;
	}

	private static int areaOfSquare(int side) {
		int result = side * side;
		return result;
	}

	private static double areaOfCircle(int radius) {
		double result = Math.PI * (radius * radius);
		return result;
	}

	private static int areaOfRectangle(int width, int height) {
		int result = width * height;
		return result;
	}

}
