/*
 * 
 *	Print sýnýfýnda metotlarý static yapmamýzýn nedeni, bu metotlarý bir utility
 *  yani araç olarak kullanýyor olmamýzdandýr.
 * 
 *  Bu sayede , bellekte yeni bir nesne oluþturmamýþ oluyoruz ve ilerde programýmýza 
 *  sorun yaratabilecek bellek problemine engel olmuþ oluyoruz.
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
