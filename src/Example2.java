import java.util.Scanner;

public class Example2 {

	public static void dortIslem() {
		
		System.out.print("1-Toplama \n");
		System.out.print("2-��karma \n");
		System.out.print("3-�arpma \n");
		System.out.print("4-B�lme \n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir i�lem numaras� giriniz : ");
		int process = scanner.nextInt();
		
		System.out.println("�lk say�n�z : ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("�kinci say�n�z : ");
		int secondNumber = scanner.nextInt();
		
		switch (process) {
		case 1:
			System.out.println("Toplam : " + (firstNumber + secondNumber));
			break;
			
		case 2:
			System.out.println("Fark : " + (firstNumber - secondNumber));
			break;
			
		case 3:
			System.out.println("�arp�m : " + (firstNumber * secondNumber));
			break;
			
		case 4:
			System.out.println("B�l�m : " + (firstNumber / (double)secondNumber));
			break;
		default:
			System.out.println("Hatal� i�lem numaras� tu�lad�n�z.L�tfen tekrar deneyin.");
			break;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		dortIslem();

	}

}
