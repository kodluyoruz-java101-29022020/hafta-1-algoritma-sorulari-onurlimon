import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example3 {

	
	public static int[] getRandomList() {
		
		Random random = new Random();
		
		int[] numbers =new int[100];
		
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		
		/*for (Integer number : numbers) {
			System.out.println(number);
		}*/
		
		return numbers;
		
		
	}
	
	public static double getAverage(int[] list) {
		
		int totalElement = list.length;
		int total = 0;
		double average;
		
		for (int number : list) {
			total += number;
		}
		
		average = total / (double) totalElement;
		return average;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] myRandomList = getRandomList(); 
		
		System.out.println("Ortalama : " + getAverage(myRandomList));

	}

}
