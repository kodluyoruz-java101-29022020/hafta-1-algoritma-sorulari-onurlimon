import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		 final String password="12345";
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Please enter your password : ");
		 String newPassword = scanner.next();
		 
		 if(password.equals(newPassword)) {
			 System.out.println("Giri� Ba�ar�l�!");
		 }
		 else {
			 System.out.println("Giri� Ba�ar�s�z");
		 }

	}

}
