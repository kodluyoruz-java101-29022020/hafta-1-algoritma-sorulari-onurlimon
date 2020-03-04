import java.util.Random;

public class Example5 {

	public static int[] getRandomList() {

		Random random = new Random();

		int[] numbers = new int[100];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}

		/*
		 * for (Integer number : numbers) { System.out.println(number); }
		 */

		return numbers;

	}

	public static void oddOrEven(int[] myList) {

		for (int number : myList) {

			if (number % 2 == 0) {
				System.err.println("Çift Sayı : " + number);
			} else {
				System.out.println("Tek Sayı : " + number);
			}

		}

	}

	public static void main(String[] args) {

		int[] myList = getRandomList();

		oddOrEven(myList);
	}

}
