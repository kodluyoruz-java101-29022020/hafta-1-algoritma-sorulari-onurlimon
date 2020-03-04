import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//	Enter 10 for the example of Batuhan teacher :)
		
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		
		for(int i = 0 ; i < number ; i++) {
			System.out.println();
			for(int j=0 ; j < i; j++) {
				System.out.print("*");
			}
		}

	}

}
