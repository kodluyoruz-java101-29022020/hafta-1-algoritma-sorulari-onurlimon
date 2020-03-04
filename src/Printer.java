/*
 * 
 *	Print s�n�f�nda metotlar� static yapmam�z�n nedeni, bu metotlar� bir utility
 *  yani ara� olarak kullan�yor olmam�zdand�r.
 * 
 *  Bu sayede , bellekte yeni bir nesne olu�turmam�� oluyoruz ve ilerde program�m�za 
 *  sorun yaratabilecek bellek problemine engel olmu� oluyoruz.
 * 
 * 
 */

public class Printer {
	
	public static void printPDFDocument(PDFDocument pdfDocument) {
		
		System.out.println(pdfDocument.getBody());
	}
	
	public static void printWordDocument(WordDocument wordDocument) {
		
		System.out.println(wordDocument.getBody());
	}
	
	
	public static void main(String[] args) {
		
		PDFDocument pdfDocument = new PDFDocument("Pdf Body");
		
		WordDocument wordDocument = new WordDocument("Word Body");
		
		
		printPDFDocument(pdfDocument);
		
		System.out.println("************");
		
		printWordDocument(wordDocument);
		
	}

}
