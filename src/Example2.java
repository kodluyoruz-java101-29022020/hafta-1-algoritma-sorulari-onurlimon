import java.util.Scanner;

public class Example2 {

	public static void dortIslem() {
		
		System.out.print("1-Toplama \n");
		System.out.print("2-Çýkarma \n");
		System.out.print("3-Çarpma \n");
		System.out.print("4-Bölme \n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir iþlem numarasý giriniz : ");
		int process = scanner.nextInt();
		
		System.out.println("Ýlk sayýnýz : ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Ýkinci sayýnýz : ");
		int secondNumber = scanner.nextInt();
		
		switch (process) {
		case 1:
			System.out.println("Toplam : " + (firstNumber + secondNumber));
			break;
			
		case 2:
			System.out.println("Fark : " + (firstNumber - secondNumber));
			break;
			
		case 3:
			System.out.println("Çarpým : " + (firstNumber * secondNumber));
			break;
			
		case 4:
			System.out.println("Bölüm : " + (firstNumber / (double)secondNumber));
			break;
		default:
			System.out.println("Hatalý iþlem numarasý tuþladýnýz.Lütfen tekrar deneyin.");
			break;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		dortIslem();

	}

}
